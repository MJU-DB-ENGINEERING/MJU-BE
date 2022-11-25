package com.project.db.mju.webserver.web.controller;

import com.project.db.mju.webserver.web.dto.ProjectPMEvaluationDto;
import com.project.db.mju.webserver.web.dto.ProjectPMEvaluationViewDto;
import com.project.db.mju.webserver.web.dto.ProjectPMEvaluationViewRequestDto;
import com.project.db.mju.webserver.web.service.ProjectPMEvalutaionViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProjectPMEvalutaionViewController {

    @Autowired
    ProjectPMEvalutaionViewService service;

    @PostMapping("v1/view/evalutaion")
    public List<ProjectPMEvaluationViewDto> viewEvaluation(ProjectPMEvaluationViewRequestDto requestDto) {

        List<ProjectPMEvaluationViewDto> allEvals = service.getAllEvals(requestDto);

        return allEvals;
    }
}
