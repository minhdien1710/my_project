package com.codegym.service;

import com.codegym.model.RoleOfTeacher;

import java.util.Optional;

public interface RoleOfTeacherService {
    Iterable<RoleOfTeacher> findAll();
    Optional<RoleOfTeacher> findById(Long id);
    void save(RoleOfTeacher roleOfTeacher);
    void delete(Long id);
}
