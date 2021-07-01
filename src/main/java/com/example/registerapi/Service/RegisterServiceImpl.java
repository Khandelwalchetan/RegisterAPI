package com.example.registerapi.Service;

import com.example.registerapi.Dao.UserDao;
import com.example.registerapi.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegisterServiceImpl implements  RegisterService{
    @Autowired
    private UserDao userDao;
    public void saveUser(User user) {
        userDao.save(user);
    }

    @Override
    public boolean validEmail(String email) {
        for(User user:userDao.findAll())
            if(user.getEmail().equals(email))
                return false;
        return true;
    }
}
