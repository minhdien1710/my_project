package com.codegym.service.impl;

import com.codegym.model.RolesInClass;
import com.codegym.repository.IRoleInClassRepository;
import com.codegym.service.RoleInClassService;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;

public class RoleInClassImpl implements RoleInClassService {
    @Autowired
    IRoleInClassRepository roleInClassRepository;
    @Override
    public Iterable<RolesInClass> findAll() {
        return roleInClassRepository.findAll();
    }
}
