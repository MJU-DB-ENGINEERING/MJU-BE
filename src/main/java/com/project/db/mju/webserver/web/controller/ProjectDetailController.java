package com.project.db.mju.webserver.web.controller;

import com.project.db.mju.webserver.web.dto.ProjectDetailViewResponseDto;
import com.project.db.mju.webserver.web.service.ProjectDetailService;
import com.project.db.mju.webserver.web.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProjectDetailController {

    @Autowired
    ProjectDetailService detailService;

    @Autowired
    ProjectService projectService;

    @GetMapping("v1/view/{projectName}/detail/")
    public List<ProjectDetailViewResponseDto> projectDetailView(@PathVariable(name = "projectName") String name) {

        Long projectId = projectService.findProjectByProjectName(name).getId();

        List<ProjectDetailViewResponseDto> allDetails = detailService.getAllDetails(projectId);
        return allDetails;
    }
}
