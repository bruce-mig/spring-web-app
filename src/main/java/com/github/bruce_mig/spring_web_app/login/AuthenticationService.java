package com.github.bruce_mig.spring_web_app.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    public boolean authenticate(String username, String password){
        boolean isValidUserName = username.equalsIgnoreCase("name");
        boolean isValidPassword = password.equalsIgnoreCase("password");
        return isValidUserName && isValidPassword;
    }
}
