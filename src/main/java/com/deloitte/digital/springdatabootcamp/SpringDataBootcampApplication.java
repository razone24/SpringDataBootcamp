package com.deloitte.digital.springdatabootcamp;

import com.deloitte.digital.springdatabootcamp.embedded.service.StoreService;
import com.deloitte.digital.springdatabootcamp.enumerated.model.entity.Vehicle;
import com.deloitte.digital.springdatabootcamp.enumerated.service.VehicleService;
import com.deloitte.digital.springdatabootcamp.relationships.mannyToManny.service.StudentService;
import com.deloitte.digital.springdatabootcamp.relationships.oneToManny.EmployeeService;
import com.deloitte.digital.springdatabootcamp.relationships.oneToOne.service.PersonService;
import com.deloitte.digital.springdatabootcamp.temporal.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDataBootcampApplication implements CommandLineRunner {

    @Autowired
    private ApplicationContext applicationContext;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataBootcampApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        ProductService productService = (ProductService) applicationContext.getBean("productService");
//        productService.create();

//        StoreService storeService = (StoreService) applicationContext.getBean("storeService");
//        storeService.create();

//        AddressService addressService = (AddressService) applicationContext.getBean("addressService");
//        addressService.create();

//        AddressWithIdClassService addressWithIdClassService = (AddressWithIdClassService) applicationContext.getBean("addressWithIdClassService");
//        addressWithIdClassService.create();

//        VehicleService vehicleService = (VehicleService) applicationContext.getBean("vehicleService");
//        vehicleService.create();

//        InvoiceService invoiceService = (InvoiceService) applicationContext.getBean("invoiceService");
//        invoiceService.create();

//        PersonService personService = (PersonService) applicationContext.getBean("personService");
//        personService.create();

//        EmployeeService employeeService = (EmployeeService) applicationContext.getBean("employeeService");
//        employeeService.create();

//        StudentService studentService = (StudentService) applicationContext.getBean("studentService");
//        studentService.create();
    }
}
