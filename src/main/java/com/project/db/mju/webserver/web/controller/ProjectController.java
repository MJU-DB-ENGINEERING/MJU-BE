package com.project.db.mju.webserver.web.controller;

import com.project.db.mju.webserver.web.dto.ProjectDto;
import com.project.db.mju.webserver.web.service.ProjectService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("v1/search/project")
@Api
public class ProjectController {
    @Autowired
    private ProjectService projectService;

    @GetMapping("/{projectName}")
    @ApiOperation(value = "일치하는 프로젝트를 찾아서 돌려준다.")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "정상 응답"),
            @ApiResponse(responseCode = "404", description = "해당 프로젝트 이름 없음")
    })
    @ResponseBody
    public ProjectDto project(@PathVariable(value = "projectName") String name) {
        return projectService.findProjectByProjectName(name);
    }
}
