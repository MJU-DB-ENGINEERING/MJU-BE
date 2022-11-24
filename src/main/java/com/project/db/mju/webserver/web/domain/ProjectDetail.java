package com.project.db.mju.webserver.web.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class ProjectDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "project_detail_id")
    private Long projectDetailId;

    @Column(name = "project_id")
    private Long projectId;

    @Column(name = "employee_number", nullable = false)
    private Long employeeNumber;
    @Column(name = "employee_job", nullable = false)
    private Long employeeJob;

    @Column(name = "join_date")
    private LocalDateTime joinDate;
    @Column(name = "quit_date")
    private LocalDateTime quitDate;
}
