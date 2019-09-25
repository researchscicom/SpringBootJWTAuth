package com.hasee.jwt.model;

import javax.persistence.*;

@Entity
@Table(name = "Jwtuser")
public class JwtUser {
    @Column(name = "Username")
    private String username;

    @Column(name = "Id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "Role")
    private String role;

    @Column(name = "Password")
    private String password;

    @Column(name = "Token")
    private String token;

    public void setUserName(String userName) {
        this.username = userName;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getUserName() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public String getRole() {
        return role;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
