package com.example.registerapi.Service;

import com.example.registerapi.entities.User;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;



public interface RegisterService {
    public void saveUser(User user);
    public boolean validEmail(String email);
}
