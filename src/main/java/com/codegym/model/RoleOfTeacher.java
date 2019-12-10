package com.codegym.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "role_of_teacher")
public class RoleOfTeacher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @OneToMany(mappedBy = "roleOfTeacher", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Set<RolesInClass> rolesInClasses;
}
