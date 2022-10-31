package com.thirdcycle.businessadministrator.services;

import com.thirdcycle.businessadministrator.Repositories.TransactionsRepository;
import com.thirdcycle.businessadministrator.Entities.Transaction;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class TransactionService {
/*
    Transaction transaction1;
    public TransactionService(){
        this.transaction1 = new Transaction(500,"compraprueba");
    }

    public Transaction getTransaction1(){
        return this.transaction1;
    }

 */
    public TransactionsRepository repository1;
    public TransactionService(TransactionsRepository repository1){
        this.repository1 = repository1;
    }
    public List<Transaction> getRepository() {
        return this.repository1.findAll();
    }

    public Transaction getRepository2(@PathVariable Long id ){

        Optional<Transaction> transactionOne = this.repository1.findById(id);
        if (transactionOne.isPresent()){
            return transactionOne.get();
        } else {return new Transaction();}
    };

    public Transaction newTransaction(Transaction request){
        return this.repository1.save(request);
    }

    public Transaction UpdateTransaction(Transaction request){
        return this.repository1.save(request);
    }

    public Transaction deleteTransaction(Long id){
        Transaction currentTransaction = this.repository1.findById(id).orElseThrow();
        this.repository1.deleteById(id);
        return currentTransaction;
    }

}
