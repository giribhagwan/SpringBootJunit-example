package com.junit.demo.services;

import com.junit.demo.domain.User;
import com.junit.demo.repositories.UserRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(SpringJUnit4ClassRunner.class)
public class UserTestCases {
    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserImpl userService;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetAllToDo(){
        List<User> toDoList = new ArrayList<User>();
        toDoList.add(new User("bhagwan","java"));
        toDoList.add(new User("bhagwan","java"));
        toDoList.add(new User("bhagwan","java"));
        toDoList.add(new User("bhagwan","java"));

        when(userRepository.findAll()).thenReturn(toDoList);

        List<User> result = userService.getAllToDo();
        assertEquals(4, result.size());
    }
}
