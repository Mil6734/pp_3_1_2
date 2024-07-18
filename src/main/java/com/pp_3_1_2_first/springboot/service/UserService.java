package com.pp_3_1_2_first.springboot.service;

import com.pp_3_1_2_first.springboot.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(Long id);
    User getUserById(Long id);
    List<User> getAllUsers();
}
