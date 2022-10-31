package com.thirdcycle.businessadministrator.services;

import com.thirdcycle.businessadministrator.Repositories.EmployeeRepository;
import com.thirdcycle.businessadministrator.Entities.Employee2;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class Employee2Service {
/*
    Employee2 employee1;

    public Employee2Service(){

        this.employee1 = new Employee2("Andres H","a.hurtado@sdf","Admin","Mellow","ASDFSD","Ab.12345");
    }

    public Employee2 getEmployee1(){
        return this.employee1;
    }

 */
    private EmployeeRepository employeeRepository1;
    public Employee2Service(EmployeeRepository employeeRepository1){this.employeeRepository1=employeeRepository1;}
    public List<Employee2> getRepository(){ return this.employeeRepository1.findAll();}


    public Employee2 getRepository2(@PathVariable Long id ){

        Optional<Employee2> employeeOne = this.employeeRepository1.findById(id);

        if (employeeOne.isPresent()){
            return employeeOne.get();
        } else {return new Employee2();}

    };

    public Employee2 newEmployee2(Employee2 request){
        return this.employeeRepository1.save(request);
    }

    public Employee2 UpdateEmployee2(Employee2 request){
        return this.employeeRepository1.save(request);
    }

    public Employee2 deleteEmployee2(Long id){
        Employee2 currentEmployee2 = this.employeeRepository1.findById(id).orElseThrow();
        this.employeeRepository1.deleteById(id);
        return currentEmployee2;
    }

}
