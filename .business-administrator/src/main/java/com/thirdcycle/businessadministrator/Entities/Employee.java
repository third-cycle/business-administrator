package com.thirdcycle.businessadministrator.Entities;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "employees")
@ToString @EqualsAndHashCode

public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter @Setter @Column(name = "id")
    private Long id;
    @Getter @Setter @Column(name = "name")
    private String name;
    @Getter @Setter @Column(name = "email")
    private String email;
    @Getter @Setter @Column(name = "role")
    private String role;
    @Getter @Setter @Column(name = "enterprise")
    private String enterprise;
    @Getter @Setter @Column(name = "profile")
    private String profile;
    @Getter @Setter @Column(name = "password")
    private String password;
}