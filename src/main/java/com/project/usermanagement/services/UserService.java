package com.project.usermanagement.services;

import com.project.usermanagement.entity.User;

import java.util.List;

public interface UserService {

    public List<User> getUsers();

    public User getUserById(Integer userId);

    public User addUser(User user);

    public User updateUser(User user);

    public void deleteUser(Integer userId);

}
