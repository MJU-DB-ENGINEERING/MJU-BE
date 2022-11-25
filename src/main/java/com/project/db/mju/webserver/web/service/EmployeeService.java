package com.project.db.mju.webserver.web.service;

import com.project.db.mju.webserver.web.domain.Employee;
import com.project.db.mju.webserver.web.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee getByName(String name) {
        return employeeRepository.findEmployeeByName(name);
    }

    public Employee getById(Long id) {
        return employeeRepository.findById(id).get();
    }
}
