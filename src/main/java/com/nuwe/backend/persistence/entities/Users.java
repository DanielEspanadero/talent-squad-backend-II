package com.nuwe.backend.persistence.entities;

import com.nuwe.backend.util.Constants;

import javax.persistence.*;

@Entity
@Table(name = Constants.USERS)
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    @Column(name = Constants.NAME, length = 20, nullable = false)
    private String name;

    @Column(name = Constants.EMAIL, length = 40, nullable = false)
    private String email;

    @Column(name = Constants.PASSWORD, length = 20, nullable = false)
    private String password;

    public String getName(String name) {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
