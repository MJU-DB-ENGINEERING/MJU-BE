package com.project.db.mju.webserver.web.dto;


import com.project.db.mju.webserver.web.domain.Project;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProjectDto {
    @ApiModelProperty(example="1")
    private Long id;

    @ApiModelProperty(example = "세미프로젝트")
    private String projectName;

    @ApiModelProperty(example = "2021-06-19")
    private LocalDate startDate;

    @ApiModelProperty(example = "2021-11-01")
    private LocalDate endDate;

    @ApiModelProperty(example = "1")
    private Long customerId;

    @ApiModelProperty(example = "note")
    private String note;

    public ProjectDto(final Project project) {
        setId(project.getId());
        setProjectName(project.getProjectName());
        setStartDate(project.getStartDate());
        setEndDate(project.getEndDate());
        setNote(project.getNote());
        setCustomerId(project.getCustomerId());
    }
}
