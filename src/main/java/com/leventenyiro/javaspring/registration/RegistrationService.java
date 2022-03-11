package com.leventenyiro.javaspring.registration;

import com.leventenyiro.javaspring.user.User;
import com.leventenyiro.javaspring.user.UserService;

import org.springframework.stereotype.Service;

@Service
public class RegistrationService {
    private final UserService appUserService;
    private final EmailValidator emailValidator;
    //private final ConfirmationTokenService confirmationTokenService;
    //private final EmailSender emailSender;

    public RegistrationService(UserService appUserService, EmailValidator emailValidator) {
        this.appUserService = appUserService;
        this.emailValidator = emailValidator;
    }

    public String register(RegistrationRequest request) {
        if (!emailValidator.test(request.getEmail())) {
            throw new IllegalStateException("Email is not valid");
        }
        return appUserService.signUpUser(
            new User(
                request.getUsername(),
                request.getEmail(),
                request.getPassword()
            )
        );
    }
}
