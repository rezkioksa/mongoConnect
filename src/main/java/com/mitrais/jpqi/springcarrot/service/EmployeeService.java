package com.mitrais.jpqi.springcarrot.service;

import com.mitrais.jpqi.springcarrot.model.Carrot;
import com.mitrais.jpqi.springcarrot.model.Employee;
import org.springframework.stereotype.Service;

@Service
public interface EmployeeService {
    void create(Employee employee);
}
