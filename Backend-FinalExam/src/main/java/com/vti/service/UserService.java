package com.vti.service;

import com.vti.entity.RegistrationUserToken;
import com.vti.entity.User;
import com.vti.entity.UserStatus;
import com.vti.event.OnSendRegistrationUserConfirmViaEmailEvent;
import com.vti.repository.IUserRepository;
import com.vti.repository.RegistrationUserTokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserService implements IUserService {

    @Autowired
    private IUserRepository repository;


    @Autowired
    private RegistrationUserTokenRepository registrationUserTokenRepository;

    @Autowired
    private ApplicationEventPublisher eventPublisher;

    @Bean
    public PasswordEncoder encoder() {
        return new BCryptPasswordEncoder();
    }

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void createUser(User user) {

        // encode password
        user.setPassword(passwordEncoder.encode(user.getPassword()));

        // create user
        repository.save(user);

        // create new user registration token
        createNewRegistrationUserToken(user);

        // send email to confirm
        sendConfirmUserRegistrationViaEmail(user.getEmail());
    }

    @Override
    public boolean existsByUserName(String userName) {
        return repository.existsByUserName(userName);
    }

    @Override
    public boolean existsByEmail(String email) {
        return repository.existsByEmail(email);
    }

    private void createNewRegistrationUserToken(User user) {

        // create new token for confirm Registration
        final String newToken = UUID.randomUUID().toString();
        RegistrationUserToken token = new RegistrationUserToken(newToken, user);

        registrationUserTokenRepository.save(token);
    }

    public void sendConfirmUserRegistrationViaEmail(String email) {
        eventPublisher.publishEvent(new OnSendRegistrationUserConfirmViaEmailEvent(email));
    }

    @Override
    public User findUserByEmail(String email) {
        return repository.findByEmail(email);
    }

    /*
     * @see com.vti.service.IUserService#activeUser(java.lang.String)
     */
    @Override
    public void activeUser(String token) {
        RegistrationUserToken registrationUserToken = registrationUserTokenRepository.findByToken(token);

        User user = registrationUserToken.getUser();
        user.setStatus(UserStatus.ACTIVE);

        repository.save(user);

        // remove Registration User Token
        registrationUserTokenRepository.deleteById(registrationUserToken.getId());
    }

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // Check user exists by username
        User user = repository.findByUserName(username);

        if (user == null) {
            throw new UsernameNotFoundException(username);
        }

        return new org.springframework.security.core.userdetails.User(
                user.getUserName(),
                user.getPassword(),
                AuthorityUtils.createAuthorityList(user.getRole()));
    }

    @Override
    public User findByUserName(String username) {
        return repository.findByUserName(username);
    }

    @Override
    public User getUserUserName(String username) {
        return repository.getUserByUserName(username);
    }


    public Page<User> getAllUsers(Pageable pageable) {
        return repository.findAll(pageable);
    }

}
