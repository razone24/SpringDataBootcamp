package com.deloitte.digital.springdatabootcamp.relationships.oneToManny.repository;

import com.deloitte.digital.springdatabootcamp.relationships.oneToManny.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
