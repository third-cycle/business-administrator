package com.thirdcycle.businessadministrator.controllers;

import com.thirdcycle.businessadministrator.Entities.Enterprise;
import com.thirdcycle.businessadministrator.services.EnterpriseService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EnterpriseController {


    EnterpriseService enterpriseService1;


    public EnterpriseController(EnterpriseService enterpriseService1){
        this.enterpriseService1 = enterpriseService1;
    }

    //CONSULTAR TODAS
    @GetMapping("/enterprises")
    public List<Enterprise> enterprises(){
        return this.enterpriseService1.getRepository();
    }

    //CONSULTAR POR ID
    @GetMapping("/enterprises/{id}")
    public Enterprise enterprises(@PathVariable Long id){
        return this.enterpriseService1.getRepository2( id);
    }

    //BORRAR EMPRESA
    @DeleteMapping("/DeleteEnterprise/{id}")
    public  Enterprise DeleteEnterprise(@PathVariable Long id){
        return this.enterpriseService1.deleteEnterprise(id);
    }

    //NUEVA EMPRESA
    @PostMapping("/saveEnterprise")
    @ResponseStatus(HttpStatus.CREATED)
    public Enterprise save(@RequestBody Enterprise request){
        return this.enterpriseService1.newEnterprise(request);
    }

    //ACTUALIZAR EMPRESA
    @PatchMapping("/UpdateEnterprise")
    @ResponseStatus(HttpStatus.OK)
    public Enterprise update(@RequestBody Enterprise request){
        return this.enterpriseService1.UpdateEnterprise(request);
    }

}
