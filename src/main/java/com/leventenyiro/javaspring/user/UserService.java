package com.leventenyiro.javaspring.user;

import com.leventenyiro.javaspring.registration.token.ConfirmationToken;
import com.leventenyiro.javaspring.registration.token.ConfirmationTokenService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {

    private final static String USER_NOT_FOUND_MSG = "user with email %s not found";
    private final UserRepository appUserRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;
    private final ConfirmationTokenService confirmationTokenService;

    @Autowired
    public UserService(UserRepository appUserRepository, BCryptPasswordEncoder bCryptPasswordEncoder, ConfirmationTokenService confirmationTokenService) {
        this.appUserRepository = appUserRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
        this.confirmationTokenService = confirmationTokenService;
    }
    
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return appUserRepository.findByEmail(email).orElseThrow(() -> new UsernameNotFoundException(String.format(USER_NOT_FOUND_MSG, email)));
    }
    
    public String signUpUser(User appUser) {
        if (appUserRepository.findByEmail(appUser.getEmail()).isPresent())
            throw new IllegalStateException("Email is already taken");
        if (appUserRepository.findByUsername(appUser.getUsername()).isPresent())
            throw new IllegalStateException("Username is already taken");

        appUser.setPassword(bCryptPasswordEncoder.encode(appUser.getPassword()));

        appUserRepository.save(appUser);

        // token
        confirmationTokenService.saveConfirmationToken(new ConfirmationToken(appUser.getId()));

        // send email
        
        return "it works";
    }
}
