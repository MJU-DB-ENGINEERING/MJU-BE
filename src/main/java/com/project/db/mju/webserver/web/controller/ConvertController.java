package com.project.db.mju.webserver.web.controller;

import com.project.db.mju.webserver.web.service.ConvertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/convert")
public class ConvertController {

    @Autowired
    ConvertService service;

    @GetMapping("/project/id2name/{projectId}")
    public String projectId2ProjectName(@PathVariable(name = "projectId") Long projectId) {
        return service.projId2projName(projectId);
    }

    @GetMapping("/project/name2id/{projectName}")
    public Long projectName2ProjectId(@PathVariable(name = "projectName") String projectName) {
        return service.projName2projId(projectName);
    }

    @GetMapping("/employee/id2name/{employeeId}")
    public String EmployeeId2EmployeeName(@PathVariable(name = "employeeId") Long employeeId) {
        return service.employeeId2employeeName(employeeId);
    }

    @GetMapping("/employee/name2id/{employeeName}")
    public Long EmployeeId2EmployeeName(@PathVariable(name = "employeeName") String employeeName) {
        return service.employeeName2employeejId(employeeName);
    }
}
