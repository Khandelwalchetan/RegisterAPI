package com.example.registerapi.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.registerapi.entities.User;
import com.example.registerapi.Service.UserServiceimp;

import javax.naming.Binding;
import javax.validation.Valid;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserServiceimp userService;

    @GetMapping("/test")
    public List<User> test(){
        //System.out.println("Fetching all the data");
        return this.userService.findAll();
    }



    @PostMapping("/register")
    public String register(@Valid @RequestBody User user, BindingResult result)
    {
        if(result.hasErrors()){
            System.out.println(result);
        }

        System.out.println(user);

        this.userService.saveUser(user);
        return "Added in the database";
    }

}
