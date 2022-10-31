package com.thirdcycle.businessadministrator.Entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "employees")
@ToString
@EqualsAndHashCode
public class Employee2 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter @Column(name = "id")
    private Long id;
    @Getter    @Setter    @Column(name = "name")
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

    @Transient
    Transaction transaction1;


    public Employee2(String name, String email, String role, String enterprise, String profile, String password) {

        this.name = name;
        this.email = email;
        this.role = role;
        this.enterprise = enterprise;
        this.profile = profile;
        this.password = password;
    }

    public Employee2() {

    }

    @Override
    public String toString(){
        return "Empleado {" +
                "nombre='" + name + '/' +
                "email='" + email + '/' +
                "empresa='" + enterprise + '/' +
                "rol='" + role + '/' +
                "movimiento1='" + this.transaction1 +
                '}';
    }
}
