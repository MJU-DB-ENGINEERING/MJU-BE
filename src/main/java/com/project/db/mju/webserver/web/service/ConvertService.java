package com.project.db.mju.webserver.web.service;

import com.project.db.mju.webserver.web.domain.Employee;
import com.project.db.mju.webserver.web.domain.Project;
import com.project.db.mju.webserver.web.repository.EmployeeRepository;
import com.project.db.mju.webserver.web.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ConvertService {

    @Autowired
    ProjectRepository projRepo;

    @Autowired
    EmployeeRepository employeeRepo;

    public String projId2projName(Long id) {
        Optional<Project> result = projRepo.findById(id);

        if (result.isPresent()) {
            return result.get().getProjectName();
        }
        return null;
    }

    public Long projName2projId(String name) {
        Project result = projRepo.findProjectByProjectName(name);

        if (result != null) {
            return result.getId();
        }
        return null;
    }

    public String employeeId2employeeName(Long id) {
        Optional<Employee> result = employeeRepo.findById(id);

        if (result.isPresent()) {
            return result.get().getName();
        }
        return null;
    }

    public Long employeeName2employeejId(String name) {
        Employee result = employeeRepo.findEmployeeByName(name);

        if (result != null) {
            return result.getId();
        }
        return null;
    }

}
