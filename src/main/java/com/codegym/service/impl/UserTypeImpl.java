package com.codegym.service.impl;

import com.codegym.model.UserType;
import com.codegym.repository.IUserTypeRepository;
import com.codegym.service.UserTypeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class UserTypeImpl implements UserTypeService {
    @Autowired
    IUserTypeRepository userTypeRepository;

    @Override
    public Iterable<UserType> findAll() {
        return userTypeRepository.findAll();
    }

    @Override
    public void save(UserType userType) {
        userTypeRepository.save(userType);
    }

    @Override
    public void delete(Long id) {
        userTypeRepository.deleteById(id);
    }

    @Override
    public Optional<UserType> findById(Long id) {
        return userTypeRepository.findById(id);
    }
}
