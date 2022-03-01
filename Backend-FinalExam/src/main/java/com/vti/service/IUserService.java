package com.vti.service;

import com.vti.entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface IUserService extends UserDetailsService {
    User findByUserName(String username);
    User getUserUserName(String username);
    void createUser(User user);

    public boolean existsByUserName(String userName);

    public boolean existsByEmail(String email);

    User findUserByEmail(String email);

    void activeUser(String token);

    void sendConfirmUserRegistrationViaEmail(String email);

}
