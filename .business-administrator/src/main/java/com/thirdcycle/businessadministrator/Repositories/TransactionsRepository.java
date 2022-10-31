package com.thirdcycle.businessadministrator.Repositories;

import com.thirdcycle.businessadministrator.Entities.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionsRepository extends JpaRepository<Transaction, Long> {

}
