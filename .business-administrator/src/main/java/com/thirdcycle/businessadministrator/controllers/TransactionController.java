package com.thirdcycle.businessadministrator.controllers;

import com.thirdcycle.businessadministrator.Entities.Transaction;
import com.thirdcycle.businessadministrator.services.TransactionService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TransactionController {

    TransactionService transactionService1;

    public TransactionController(TransactionService transactionService1){
        this.transactionService1 = transactionService1;
    }

    //CONSULTAR TODAS
    @GetMapping("/transactions")
    public List<Transaction>transactions(){
        return this.transactionService1.getRepository();
    }


    //CONSULTAR POR ID
    @GetMapping("/transactions/{id}")
    public Transaction transactions(@PathVariable Long id){ return this.transactionService1.getRepository2( id);
    }

    //BORRAR TRANSACCION
    @DeleteMapping("/DeleteTransactions/{id}")
    public  Transaction DeleteTransaction(@PathVariable Long id){
        return this.transactionService1.deleteTransaction(id);
    }

    //NUEVA TRANSACCION
    @PostMapping("/saveTransactions")
    @ResponseStatus(HttpStatus.CREATED)
    public Transaction save(@RequestBody Transaction request){
        return this.transactionService1.newTransaction(request);
    }

    //ACTUALIZAR TRANSACCION
    @PatchMapping("/UpdateTransactions")
    @ResponseStatus(HttpStatus.OK)
    public Transaction update(@RequestBody Transaction request){
        return this.transactionService1.UpdateTransaction(request);
    }
}