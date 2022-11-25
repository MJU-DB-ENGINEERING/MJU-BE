package com.project.db.mju.webserver.web.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProjectPMEvaluationDto {
    private Long projectId;

    private Long evaluator;
    private Long evaluated;

    private String communicationComment;
    private String businessComment;

    private Long communicationRate;
    private Long businessRate;
}
