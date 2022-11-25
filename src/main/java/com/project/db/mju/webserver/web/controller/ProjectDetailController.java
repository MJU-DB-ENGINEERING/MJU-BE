package com.project.db.mju.webserver.web.controller;

import com.project.db.mju.webserver.web.dto.ProjectDetailViewResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProjectDetailController {

    @GetMapping("v1/view/{projectName}/detail/")
    public List<ProjectDetailViewResponseDto> projectDetailView(@PathVariable(name = "projectName") String name) {

        return null;
    }
}
