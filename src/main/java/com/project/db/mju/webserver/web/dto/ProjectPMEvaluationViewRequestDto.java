package com.project.db.mju.webserver.web.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProjectPMEvaluationViewRequestDto {
    private Long id;
    private String evaluatorName;
    private String evaluatedName;
}
