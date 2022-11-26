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

    @PostMapping("v1/evaluation/pm/insert")
    @ApiOperation(value = "pm 평가를 등록한다.")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "정상 응답"),
            @ApiResponse(responseCode = "404", description = "업로드 실패")
    })
    @ResponseBody
    public int evaluation(@RequestBody ProjectPMEvaluationDto requestDto) {
        return pmEvaluationService.putProjectPMEvaluation(requestDto);
    }

    @PutMapping("v1/evaluation/pm/update")
    @ApiOperation(value = "존재하는 pm 평가에 대해 값을 업데이트한다")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "정상 응답"),
            @ApiResponse(responseCode = "404", description = "업로드 실패")
    })
    @ResponseBody
    public int updateEvaluation(@RequestBody ProjectPMEvaluationDto requestDto) {
        return pmEvaluationService.updateProjectPMEvalutaion(requestDto);
    }
}
