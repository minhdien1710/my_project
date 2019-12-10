package com.codegym.model;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "classes")
@Data
public class Classes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany(mappedBy = "classes")
    private Set<User> users = new HashSet<>();
    @OneToMany(mappedBy = "classes",cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Set<RolesInClass> rolesInClasses;
    private String name;
}
