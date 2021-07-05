package com.example.registerapi.Controller;

import com.example.registerapi.Dto.RegisterDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.registerapi.entities.User;
import com.example.registerapi.Service.Implementation.RegisterServiceimp;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

import static com.example.registerapi.constant.Endpoints.REGISTER;
import static com.example.registerapi.constant.Endpoints.SHOW;

@RestController
public class RegisterController {
    @Autowired
    private RegisterServiceimp userService;

    @GetMapping(SHOW)
    public ResponseEntity<List<User>> show(){

        List<User> list= this.userService.findAll();

        if(list.size()<=0){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

        }
        return ResponseEntity.of(Optional.of(list));
    }



    @PostMapping(REGISTER)
    public String register(@Valid @RequestBody RegisterDto registerDto) throws Exception{
        if(userService.validEmail(registerDto.getEmail())==false){
            throw new Exception("Email Already in use");


        }

        this.userService.saveUser(new User(registerDto));
        return "User Registered Successfully";
    }

}
