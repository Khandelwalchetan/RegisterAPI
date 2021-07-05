package com.example.registerapi.Controller;

import com.example.registerapi.Dto.LoginDto;
import com.example.registerapi.Service.Implementation.LoginServiceimp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    private LoginServiceimp loginServiceimp;

    @PostMapping("/login")
    public String login(@RequestBody LoginDto loginDto) throws Exception {
        //Check for authentication
        System.out.println("LOgin quesmsdbdmnfbdkjsv");
        System.out.println(loginDto);
        if(!loginServiceimp.isAuthenticated(loginDto))
        {
            throw new Exception("User Doesn't Exists!");
        }
        return "Successfully Logged In!";
    }

}
