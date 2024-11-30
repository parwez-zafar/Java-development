package com.parwez.SpringSecDemo.dao;

import com.parwez.SpringSecDemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {

    User findByUsername(String username);
}
