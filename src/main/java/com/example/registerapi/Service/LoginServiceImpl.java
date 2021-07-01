package com.example.registerapi.Service;

import com.example.registerapi.Dao.UserDao;
import com.example.registerapi.dto.LoginDto;
import com.example.registerapi.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserDao userDao;

    @Override
    public boolean isAuthenticated(LoginDto loginDto){
        //User doesn't exists
        for(User user:userDao.findAll())
            if(user.getEmail().equals(loginDto.getEmail()) && user.getPassword().equals(loginDto.getPassword()))
                return true;
        return false;
    }

}
