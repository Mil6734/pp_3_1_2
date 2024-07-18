package com.pp_3_1_2_first.springboot.dao;

import com.pp_3_1_2_first.springboot.model.User;

import java.util.List;

public interface UserDao {
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(Long id);
    User getUserById(Long id);
    List<User> getAllUsers();
}
