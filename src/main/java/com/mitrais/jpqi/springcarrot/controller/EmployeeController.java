package com.mitrais.jpqi.springcarrot.controller;

import com.mitrais.jpqi.springcarrot.model.Employee;
import com.mitrais.jpqi.springcarrot.repository.EmployeeRepository;
import com.mitrais.jpqi.springcarrot.service.EmployeeServiceUsingDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/employees")
public class EmployeeController {
    @Autowired
    EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @GetMapping
    public List<Employee> findAll(){
        return employeeRepository.findAll();
    }

    @PostMapping
    public void create(@RequestBody  Employee employee) {
        employeeRepository.save(employee);
    }
}
