package com.devsuperior.dsmeta.repositories;

import com.devsuperior.dsmeta.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {


}
