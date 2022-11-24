package com.project.db.mju.webserver.web.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="project")
@Getter
@Setter
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "int")
    private Long id;

    @Column(name = "project_name", columnDefinition = "varchar(30)")
    private String projectName;

    @Column(name = "start_date", columnDefinition = "date")
    private LocalDate startDate;

    @Column(name = "end_date", columnDefinition = "date")
    private LocalDate endDate;

    @Column(name = "customer_id", columnDefinition = "int")
    private Long customerId;

    @Column(name = "note", columnDefinition = "varchar(100)")
    private String note;
}
