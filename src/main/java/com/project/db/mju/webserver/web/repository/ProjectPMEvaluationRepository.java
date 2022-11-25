package com.project.db.mju.webserver.web.repository;

import com.project.db.mju.webserver.web.domain.ProjectPMEvaluation;
import com.project.db.mju.webserver.web.dto.ProjectPMEvaluationDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProjectPMEvaluationRepository extends JpaRepository<ProjectPMEvaluation, Long> {
    @Modifying
    @Query(value = "insert into project_pm_evaluation(project_id, communication_rate, communication_comment, business_rate, business_comment, evaluator, evaluated)", nativeQuery = true)
    public int putProjectPMEvaluation(Long project_id, Long communication_rate, String communication_comment,
                                      Long business_rate, String business_comment, Long evaluator, Long evaluated);
}
