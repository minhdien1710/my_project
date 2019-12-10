package com.codegym.repository;

import com.codegym.model.RoleOfTeacher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IRoleOfTeacherRepository extends JpaRepository<RoleOfTeacher,Long> {
    Optional<RoleOfTeacher> findById(Long id);
}
