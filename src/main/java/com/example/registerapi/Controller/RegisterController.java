package com.example.registerapi.Controller;

import com.example.registerapi.Service.RegisterServiceImpl;
import com.example.registerapi.dto.RegisterDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.registerapi.entities.User;
import javax.validation.Valid;

@RestController
public class RegisterController {
    @Autowired
    private RegisterServiceImpl registerServiceImpl;

    @PostMapping("/register")
    public String register(@Valid @RequestBody RegisterDto registerDto) throws Exception {
        if(!registerServiceImpl.validEmail(registerDto.getEmail()))
            throw new Exception("Email Already in Use");
        registerServiceImpl.saveUser(new User(registerDto));
        return "User registered Successfully";
    }

}
