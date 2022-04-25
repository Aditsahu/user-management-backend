package com.project.usermanagement.services;

import com.project.usermanagement.dao.UserDao;
import com.project.usermanagement.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getUsers() {
        return userDao.findAll();
    }

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public User addUser(User user) {
        return userDao.save(user);
    }

    @Override
    public User updateUser(User user) {
        userDao.save(user);
        return user;
    }

    @Override
    public void deleteUser(Integer userId) {
        User user = userDao.getById(userId);
        userDao.delete(user);
    }
}
