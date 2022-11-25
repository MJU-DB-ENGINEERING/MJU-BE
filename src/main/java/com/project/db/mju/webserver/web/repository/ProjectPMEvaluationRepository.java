package com.project.db.mju.webserver.web.repository;

import com.project.db.mju.webserver.web.domain.ProjectPMEvaluation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;
import java.util.List;

public interface ProjectPMEvaluationRepository extends JpaRepository<ProjectPMEvaluation, Long> {

    @Query(value = "SELECT * FROM project_pm_evaluation WHERE project_pm_evaluation.project_id=:projectId and project_pm_evaluation.evaluator=:evaluator", nativeQuery = true)
    public Collection<ProjectPMEvaluation> getAllPmEvaluations(Long projectId, Long evaluator);
}
