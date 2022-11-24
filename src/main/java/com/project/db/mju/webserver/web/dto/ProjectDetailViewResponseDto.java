package com.project.db.mju.webserver.web.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProjectDetailViewResponseDto {
    private String employeeName;
    private String jobType;
    private LocalDateTime joinDate;
    private LocalDateTime quitDate;
}
