package com.project.db.mju.webserver.web.controller;

import com.project.db.mju.webserver.web.dto.ProjectPMEvaluationDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProjectPMEvaluationController {

    @PostMapping("v1/evaluation/pm")
    public ProjectPMEvaluationDto evaluation(@RequestBody ProjectPMEvaluationDto requestDto) {
        return null;
    }

}
