package com.codegym.service.impl;

import com.codegym.model.RoleOfTeacher;
import com.codegym.repository.IRoleOfTeacherRepository;
import com.codegym.service.RoleOfTeacherService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class RoleOfTeacherImpl implements RoleOfTeacherService {
    @Autowired
    IRoleOfTeacherRepository roleOfTeacherRepository;

    @Override
    public Iterable<RoleOfTeacher> findAll() {
        return roleOfTeacherRepository.findAll();
    }

    @Override
    public Optional<RoleOfTeacher> findById(Long id) {
        return roleOfTeacherRepository.findById(id);
    }

    @Override
    public void save(RoleOfTeacher roleOfTeacher) {
        roleOfTeacherRepository.save(roleOfTeacher);
    }

    @Override
    public void delete(Long id) {
        roleOfTeacherRepository.deleteById(id);
    }
}
