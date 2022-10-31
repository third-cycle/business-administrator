package com.thirdcycle.businessadministrator.Entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "enterprises")
@ToString
@EqualsAndHashCode
public class Enterprise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter    @Setter    @Column(name = "id")
    private Long id;
    @Getter @Setter @Column(name = "name")
    private String name;
    @Getter @Setter @Column(name = "address")
    private String address;
    @Getter @Setter @Column(name = "phone")
    private String phone;
    @Getter @Setter @Column(name = "nit")
    private String nit;

    @Transient
    Employee2 employee1;


    public Enterprise(String name, String address, String phone, String nit) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.nit = nit;
    }

    public Enterprise() {

    }

    @Override
    public String toString() {
        return "Enterprise{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", NIT='" + nit + '\'' +
                ", employee1=" + this.employee1 +
                '}';
    }
}
