package com.project.db.mju.webserver.web.service;

import com.project.db.mju.webserver.web.domain.ProjectPMEvaluation;
import com.project.db.mju.webserver.web.dto.ProjectPMEvaluationDto;
import com.project.db.mju.webserver.web.repository.ProjectPMEvaluationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PMEvaluationService {
    @Autowired
    private ProjectPMEvaluationRepository projectPMEvaluationRepository;

    @Transactional
    public int putProjectPMEvaluation(ProjectPMEvaluationDto projectPMEvaluationDto) {
        return projectPMEvaluationRepository.putProjectPMEvaluation(null, projectPMEvaluationDto.getProjectId(), projectPMEvaluationDto.getCommunicationRate(),
                projectPMEvaluationDto.getCommunicationComment(), projectPMEvaluationDto.getBusinessRate(), projectPMEvaluationDto.getBusinessComment(),
                projectPMEvaluationDto.getEvaluator(), projectPMEvaluationDto.getEvaluated());
    }

    @Transactional
    public int updateProjectPMEvalutaion(ProjectPMEvaluationDto projectPMEvaluationDto) {
        ProjectPMEvaluation result = projectPMEvaluationRepository.findProjectPMEvaluationByProjectIdAndEvaluated(projectPMEvaluationDto.getProjectId(), projectPMEvaluationDto.getEvaluated());

        if (result != null) {
            if (result.getEvaluator().equals(projectPMEvaluationDto.getEvaluator()) && result.getEvaluated().equals(projectPMEvaluationDto.getEvaluated())) {
                result.setBusinessComment(projectPMEvaluationDto.getBusinessComment());
                result.setBusinessRate(projectPMEvaluationDto.getBusinessRate());
                result.setCommunicationComment(projectPMEvaluationDto.getCommunicationComment());
                result.setCommunicationRate(projectPMEvaluationDto.getCommunicationRate());
                return 1;
            }
            else return 0;
        }
        return 0;
    }
}
