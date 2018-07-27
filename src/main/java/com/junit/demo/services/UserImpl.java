package com.junit.demo.services;

import com.junit.demo.domain.User;
import com.junit.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserImpl  implements UserService{
    @Autowired
    UserRepository userRepository;
    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllToDo() {
        return userRepository.findAll();
    }
}
