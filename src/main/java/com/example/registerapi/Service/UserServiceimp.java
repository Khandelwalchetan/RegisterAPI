package com.example.registerapi.Service;

import com.example.registerapi.Dao.UserDao;
import com.example.registerapi.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceimp implements  UserService{
    @Autowired
    private UserDao userDao;




    public void saveUser(User user) {
        userDao.save(user);
    }

    public List<User> findAll(){
        return userDao.findAll();
    }
}
