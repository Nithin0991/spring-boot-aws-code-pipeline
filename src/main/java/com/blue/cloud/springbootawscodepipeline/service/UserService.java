package com.blue.cloud.springbootawscodepipeline.service;

import com.blue.cloud.springbootawscodepipeline.model.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);

    User findByUsername(String username);

    List<User> findAllUsers();
}
