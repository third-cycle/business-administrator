package com.thirdcycle.businessadministrator.controllers;

import com.thirdcycle.businessadministrator.Entities.Employee2;
import com.thirdcycle.businessadministrator.services.Employee2Service;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeesController {

    Employee2Service employee2Service1;

    public EmployeesController(Employee2Service employee2Service1) {
        this.employee2Service1 = employee2Service1;
    }

    //CONSULTAR TODAS
    @GetMapping("/users")
    public List<Employee2> employee2s() {
        return this.employee2Service1.getRepository();
    }

    //CONSULTAR POR ID
    @GetMapping("/user/{id}")
    public Employee2 employee2s(@PathVariable Long id){
        return this.employee2Service1.getRepository2( id);
    }


    //BORRAR EMPLEADO
    @DeleteMapping("/deleteUser/{id}")
    public  Employee2 DeleteEnterprise(@PathVariable Long id){
        return this.employee2Service1.deleteEmployee2(id);
    }

    //NUEVA EMPLEADO
    @PostMapping("/saveUser")
    @ResponseStatus(HttpStatus.CREATED)
    public Employee2 save(@RequestBody Employee2 request){
        return this.employee2Service1.newEmployee2(request);
    }

    //ACTUALIZAR EMPLEADO
    @PatchMapping("/UpdateUser")
    @ResponseStatus(HttpStatus.OK)
    public Employee2 update(@RequestBody Employee2 request){
        return this.employee2Service1.UpdateEmployee2(request);
    }
}

