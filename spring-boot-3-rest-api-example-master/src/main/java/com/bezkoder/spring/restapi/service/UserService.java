package com.bezkoder.spring.restapi.service;

import com.bezkoder.spring.restapi.entity.User;
import com.bezkoder.spring.restapi.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepo;

    public List<User> getUsers (){
        return userRepo.findAll();
    }

    public User createUser(User user) {
        user.setId(Long.valueOf(UUID.randomUUID().toString()));
        return userRepo.save(user);
    }
}
