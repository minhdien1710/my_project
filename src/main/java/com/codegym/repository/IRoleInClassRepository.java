package com.codegym.repository;

import com.codegym.model.RolesInClass;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IRoleInClassRepository extends JpaRepository<RolesInClass, Long> {
    Optional<RolesInClass> findById(Long id);
}
