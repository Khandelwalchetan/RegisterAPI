package com.example.registerapi.Service.Abstraction;

import com.example.registerapi.entities.User;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;



public interface RegisterService {
    public void saveUser(User user);
    public List<User> findAll();
    public boolean validEmail(String email);
}
