package com.thirdcycle.businessadministrator.Entities;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "transactions")
@ToString
@EqualsAndHashCode
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter    @Setter    @Column(name = "id")
    private Long id;
    @Getter @Setter @Column(name = "amount")
    private double amount;
    @Getter @Setter @Column(name = "concept")
    private String concept;

    @Getter @Setter @Column(name = "date")
    private String date;

    public Transaction(double amount, String concept) {
        this.amount = amount;
        this.concept = concept;
        this.date = date;
    }

    public Transaction() {

    }

}
