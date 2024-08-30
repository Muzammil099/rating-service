package com.practice.user.service.services;

import com.practice.user.service.entities.User;
import com.practice.user.service.exceptions.ResourceNotFoundException;

import java.util.List;

public interface UserService {

    //user operations

    //create
    User saveUser(User user);

    //get all users
    List<User> getAllUsers();

    //get user by Id

    User getUser(String userId);

    //TODO:
    //update
    //delete

}
