package com.codegym.repository;

import com.codegym.model.Classes;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IClassesRepository extends JpaRepository<Classes,Long> {
    Optional<Classes> findById(Long id);
}
