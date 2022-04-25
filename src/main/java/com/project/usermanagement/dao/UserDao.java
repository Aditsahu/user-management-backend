package com.project.usermanagement.dao;

import com.project.usermanagement.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Integer> {

    User getUserById(Integer userId);

}
