package com.practice.user.service.services.impl;

import com.practice.user.service.entities.User;
import com.practice.user.service.exceptions.ResourceNotFoundException;
import com.practice.user.service.repositories.UserRepository;
import com.practice.user.service.services.UserService;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;
    @Override
    public User saveUser(User user) {
        user.setUserId(UUID.randomUUID().toString());
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @SneakyThrows
    @Override
    public User getUser(String userId) {
        return userRepository.findById(userId).orElseThrow( () ->
            new ResourceNotFoundException("Resource not found for user id: " + userId)
        );
    }
}
