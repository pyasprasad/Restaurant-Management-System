package com.geekster.RestaurentManagementSystem.controllers;

import com.geekster.RestaurentManagementSystem.dto.SignInInput;
import com.geekster.RestaurentManagementSystem.dto.SignInOutput;
import com.geekster.RestaurentManagementSystem.dto.SignUpInput;
import com.geekster.RestaurentManagementSystem.dto.SignUpOutput;
import com.geekster.RestaurentManagementSystem.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/signup")
    public SignUpOutput signUp(@RequestBody SignUpInput signUpDto){
        return userService.signUp(signUpDto);
    }

    @PostMapping("/signin")
    public SignInOutput signIn(@RequestBody SignInInput signInDto){
        return userService.signIn(signInDto);
    }

}
