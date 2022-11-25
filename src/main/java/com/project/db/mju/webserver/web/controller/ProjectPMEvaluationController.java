package com.project.db.mju.webserver.web.controller;

import com.project.db.mju.webserver.web.dto.ProjectPMEvaluationDto;
import com.project.db.mju.webserver.web.service.PMEvaluationService;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProjectPMEvaluationController {
    @Autowired
    PMEvaluationService pmEvaluationService;

    @RequestMapping("v1/evaluation/pm")
    @ApiOperation(value = "pm 평가를 등록한다.")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "정상 응답"),
            @ApiResponse(responseCode = "404", description = "업로드 실패")
    })
    @ResponseBody
    public int evaluation(@RequestBody ProjectPMEvaluationDto requestDto) {
        return pmEvaluationService.putProjectPMEvaluation(requestDto);
    }

}
