package com.codegym.service;

import com.codegym.model.UserType;

import java.util.Optional;

public interface UserTypeService {
    Iterable<UserType> findAll();
    void save(UserType userType);
    void delete(Long id);
    Optional<UserType> findById(Long id);

}
