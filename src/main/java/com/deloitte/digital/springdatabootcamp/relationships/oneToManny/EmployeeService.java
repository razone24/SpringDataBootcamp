package com.deloitte.digital.springdatabootcamp.relationships.oneToManny;

import com.deloitte.digital.springdatabootcamp.relationships.oneToManny.entity.Department;
import com.deloitte.digital.springdatabootcamp.relationships.oneToManny.entity.Employee;
import com.deloitte.digital.springdatabootcamp.relationships.oneToManny.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public void create() {
        Employee employee = new Employee();
        employee.setName("Popescu");

        Department department = new Department();
        department.setName("IT");
        department.setEmployees(List.of(employee));

        employee.setDepartment(department);

        employeeRepository.save(employee);
    }
}
