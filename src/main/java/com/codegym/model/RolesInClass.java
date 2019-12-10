package com.codegym.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "role_in_class")
@Data
public class RolesInClass {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "classes_id")
    private Classes classes;
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "role_id")
    private RoleOfTeacher roleOfTeacher;

}
