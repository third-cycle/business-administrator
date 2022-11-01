package com.thirdcycle.businessadministrator.Repositories;

import com.thirdcycle.businessadministrator.Entities.Employee2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface EmployeeRepository extends JpaRepository<Employee2, Long> {
    Employee2 findByName(@Param(value = "name") String name);
}

