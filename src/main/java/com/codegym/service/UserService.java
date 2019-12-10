package com.codegym.service;

import com.codegym.model.User;

import java.util.Optional;

public interface UserService {
    Iterable<User> findAll();
}
