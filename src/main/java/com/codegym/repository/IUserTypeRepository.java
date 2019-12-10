package com.codegym.repository;

import com.codegym.model.UserType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IUserTypeRepository extends JpaRepository<UserType, Long> {
    Optional<UserType> findById(Long id);
}
