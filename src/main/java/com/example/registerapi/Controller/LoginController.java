package com.example.registerapi.Controller;

import com.example.registerapi.Service.LoginServiceImpl;
import com.example.registerapi.dto.LoginDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    private LoginServiceImpl authenticationService;

    //Login Request
    @PostMapping("/login")
    public String login(@RequestBody LoginDto loginDto) throws Exception {
        //Check for authentication
        if(!authenticationService.isAuthenticated(loginDto))
        {
            throw new Exception("User Doesn't Exists!");
        }
        return "Successfully Logged In!";
    }
}
