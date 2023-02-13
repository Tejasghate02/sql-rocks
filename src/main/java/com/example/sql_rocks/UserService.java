package com.example.sql_rocks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public String createUser(User user){
        userRepository.save(user);
        return "user added successfully";
    }

    public User getUser(Integer id){
        User user=userRepository.findById(id).get();
        return user;
    }

}
