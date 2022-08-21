package com.Spring.Boot.SpringBoot.service;

import com.Spring.Boot.SpringBoot.model.User;

import java.util.List;

public interface UserServiceImpl {

    User getUserById(int id);

    List<User> getAllUsers();

    void saveUser(User user);

    void deleteUserById(int id);

}
