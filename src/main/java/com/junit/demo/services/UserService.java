package com.junit.demo.services;

import com.junit.demo.domain.User;

import java.util.List;

public interface UserService   {
    User save(User user);

    List<User> getAllToDo();
}
