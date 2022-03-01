package com.vti.entity;

import lombok.Data;
import org.hibernate.annotations.Formula;
import javax.persistence.*;
import java.io.Serializable;
@Data
@Entity
@Table(name = "`User`")
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "`id`", unique = true, nullable = false)
    private Short id;

    @Column(name = "`username`", nullable = false, length = 50, unique = true)
    private String userName;

    @Column(name = "`email`", nullable = false, length = 50, unique = true)
    private String email;

    @Column(name = "`password`", nullable = false, length = 800)
    private String password;

    @Column(name = "`firstName`", nullable = false, length = 50)
    private String firstName;

    @Column(name = "`lastName`", nullable = false, length = 50)
    private String lastName;

    @Formula("concat(firstName, ' ', lastName)")
    private String fullName;

    @Column(name = "role", nullable = false)
    private String role;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "`status`", nullable = false)
    private UserStatus status = UserStatus.NOT_ACTIVE;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "`provider`", nullable = false)
    private UserProvider provider = UserProvider.LOCAL;

    public User() {
    }

    public User(String userName, String email, String password, String firstName, String lastName) {
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.role="Employee";
        this.status=UserStatus.NOT_ACTIVE;
    }
}

