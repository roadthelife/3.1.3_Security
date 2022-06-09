package com.example.crud.service;

import com.example.crud.model.User;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.List;

public interface UserService {
    User findById(Long id);

    List<User> getAll();

    User saveUser(User user);


    void deletedById(Long id);

    UserDetails loadUserByUsername(String username);
}
