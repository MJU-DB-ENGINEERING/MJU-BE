package com.project.db.mju.webserver.web.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class ProjectPMEvaluation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "project_id")
    private Long projectId;
    @Column(name = "communication_rate")
    private Long communicationRate;
    @Column(name = "business_rate")
    private Long businessRate;

    @Column(name = "evaluator", nullable = false)
    private Long evaluator;
    @Column(name = "evaluator", nullable = false)
    private Long evaluated;

    @Column(name = "communication_comment")
    private String communicationComment;

    @Column(name = "business_comment")
    private String businessComment;


}