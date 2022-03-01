package com.vti.controller;


import com.vti.dto.UserDTO;
import com.vti.repository.IUserRepository;
import com.vti.service.EmailService;
import com.vti.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("api/v1/users")
@CrossOrigin("*")
public class UserController {
    @Autowired
    private IUserService userService;

    @Autowired
    IUserRepository userRepository;

    @Autowired
    EmailService emailService;
    @PostMapping()
    public ResponseEntity<?> createUser(@Valid @RequestBody UserDTO dto) {
        userService.createUser(dto.toEntity());
        return new ResponseEntity<>("We have sent 1 email. Please check email to active account!", HttpStatus.OK);
    }

    @GetMapping("/activeUser")
    // validate: check exists, check not expired
    public ResponseEntity<?> activeUserViaEmail(@RequestParam String token) {

        // active user
        userService.activeUser(token);

        return new ResponseEntity<>("Active success!", HttpStatus.OK);
    }

    // resend confirm
    @GetMapping("/userRegistrationConfirmRequest")
    // validate: email exists, email not active
    public ResponseEntity<?> sendConfirmRegistrationViaEmail(@RequestParam String email) {

        userService.sendConfirmUserRegistrationViaEmail(email);

        return new ResponseEntity<>("We have sent 1 email. Please check email to active account!", HttpStatus.OK);
    }

    @GetMapping(value = "/email/{email}")
    public ResponseEntity<?> existsByEmail(@PathVariable (name = "email") String email){
        return new ResponseEntity<>(userService.existsByEmail(email),HttpStatus.OK);
    }

    @GetMapping(value = "/userName/{userName}")
    public ResponseEntity<?> existsByUserName(@PathVariable (name = "userName") String userName){
        return new ResponseEntity<>(userService.existsByEmail(userName),HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> getallUser(){
        return new ResponseEntity<>(userRepository.findAll(), HttpStatus.OK);
    }
}
