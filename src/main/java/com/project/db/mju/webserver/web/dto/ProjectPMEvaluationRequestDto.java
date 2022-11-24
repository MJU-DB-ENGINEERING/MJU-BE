package com.project.db.mju.webserver.web.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProjectPMEvaluationRequestDto {
    private Long id;
    private String evaluatorName;
}
