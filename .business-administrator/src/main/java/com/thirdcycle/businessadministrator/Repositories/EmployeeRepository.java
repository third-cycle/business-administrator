package com.thirdcycle.businessadministrator.Repositories;

import com.thirdcycle.businessadministrator.Entities.Employee2;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee2, Long> {
}
