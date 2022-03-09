package com.leventenyiro.javaspring.registration;

import com.leventenyiro.javaspring.appuser.AppUserService;

import org.springframework.stereotype.Service;

@Service
public class RegistrationService {
    private final AppUserService appUserService;
    //private final EmailValidator emailValidator;
    //private final ConfirmationTokenService confirmationTokenService;
    //private final EmailSender emailSender;

    public RegistrationService(AppUserService appUserService) {
        this.appUserService = appUserService;
    }

    public String register(RegistrationRequest request) {
        return "works";
    }
}
