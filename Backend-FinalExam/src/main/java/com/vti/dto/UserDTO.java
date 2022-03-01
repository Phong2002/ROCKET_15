package com.vti.dto;

import com.vti.entity.User;
import lombok.Data;

@Data
public class UserDTO {
    private Short id;
    private String userName;
    private String email;
    private String firstName;
    private String lastName;
    private String fullName;
    private String role;
    private String password;

    public UserDTO(Short id, String userName, String email, String firstName, String lastName, String fullName,String role) {
        this.id = id;
        this.userName = userName;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = fullName;
        this.role=role;
    }



    public User toEntity() {
        return new User(userName, email, password,firstName,lastName);
    }
}
