package com.example.registerapi.Service.Implementation;

import com.example.registerapi.Dao.UserDao;
import com.example.registerapi.Service.Abstraction.RegisterService;
import com.example.registerapi.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegisterServiceimp implements RegisterService {
    @Autowired
    private UserDao userDao;




    public void saveUser(User user) {
        userDao.save(user);
    }

    public List<User> findAll(){
        return userDao.findAll();
    }

    public boolean validEmail(String email){
        for(User user:userDao.findAll()){
            if(user.getEmail().equals(email)){
                return  false;
            }


        }
        return true;
    }
}
