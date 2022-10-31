package com.thirdcycle.businessadministrator.Repositories;

import com.thirdcycle.businessadministrator.Entities.Enterprise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnterpriseRepository extends JpaRepository<Enterprise, Long> {



}
