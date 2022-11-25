package com.project.db.mju.webserver.web.controller;

import com.project.db.mju.webserver.web.dto.ProjectPMEvaluationDto;
import com.project.db.mju.webserver.web.dto.ProjectPMEvaluationViewRequestDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProjectPMEvalutaionViewController {

    @PostMapping("v1/view/evalutaion")
    public List<ProjectPMEvaluationDto> viewEvaluation(ProjectPMEvaluationViewRequestDto requestDto) {
        return null;
    }
}
