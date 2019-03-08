package com.mitrais.jpqi.springcarrot.service;

import com.mitrais.jpqi.springcarrot.model.Carrot;
import com.mitrais.jpqi.springcarrot.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    void create(Employee employee);
    public List<Employee> findAllCarrot();
}
