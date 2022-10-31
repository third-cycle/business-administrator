package com.thirdcycle.businessadministrator.services;

import com.thirdcycle.businessadministrator.Repositories.EnterpriseRepository;
import com.thirdcycle.businessadministrator.Entities.Enterprise;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class EnterpriseService {
/*
    Enterprise enterprise1;
    Employee2Service se1 = new Employee2Service();
    public EnterpriseService() {
        Employee2 emple1 = this.se1.getEmployee1();
            this.enterprise1 = new Enterprise("Siembra","Carrera12","31445225","89895654-8",emple1);
    }

    public Enterprise getEnterprise(){
        return this.enterprise1;
    }

 */
    Employee2Service enterpriseService1;
    private EnterpriseRepository repository1;

    public EnterpriseService(EnterpriseRepository repository1){
       this.repository1= repository1;
   }
    public List<Enterprise> getRepository(){
       return this.repository1.findAll();
    }

    public Enterprise getRepository2(@PathVariable Long id ){

       Optional<Enterprise> enterpriseone = this.repository1.findById(id);
       if (enterpriseone.isPresent()){
           return enterpriseone.get();
       } else {return new Enterprise();}

   };
    public Enterprise newEnterprise(Enterprise request){
        return this.repository1.save(request);
    }

    public Enterprise UpdateEnterprise(Enterprise request){
        return this.repository1.save(request);
    }

    public Enterprise deleteEnterprise(Long id){
       Enterprise currentEnterprise = this.repository1.findById(id).orElseThrow();
       this.repository1.deleteById(id);
       return currentEnterprise;
    }


}
