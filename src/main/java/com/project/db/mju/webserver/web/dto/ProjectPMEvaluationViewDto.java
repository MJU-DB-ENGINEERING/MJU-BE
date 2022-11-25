package com.project.db.mju.webserver.web.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProjectPMEvaluationViewDto {
    private Long projectId;

    private String evaluator;
    private String evaluated;

    private String communicationComment;
    private String businessComment;

    private Long communicationRate;
    private Long businessRate;
}
