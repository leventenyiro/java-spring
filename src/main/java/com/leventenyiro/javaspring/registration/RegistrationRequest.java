package com.leventenyiro.javaspring.registration;

public class RegistrationRequest {
    private final String username;
    private final String email;
    private final String password;
    private final String passwordAgain;

    public RegistrationRequest(String username, String email, String password, String passwordAgain) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.passwordAgain = passwordAgain;
    }
}
