package com.project.db.mju.webserver.web.service;

import com.project.db.mju.webserver.web.dto.ProjectPMEvaluationDto;
import com.project.db.mju.webserver.web.repository.ProjectPMEvaluationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

@Service
public class PMEvaluationService {
    @Autowired
    private ProjectPMEvaluationRepository projectPMEvaluationRepository;

    public int putProjectPMEvaluation(ProjectPMEvaluationDto projectPMEvaluationDto) {
        return projectPMEvaluationRepository.putProjectPMEvaluation(projectPMEvaluationDto.getProjectId(), projectPMEvaluationDto.getCommunicationRate(),
                projectPMEvaluationDto.getCommunicationComment(), projectPMEvaluationDto.getBusinessRate(), projectPMEvaluationDto.getBusinessComment(),
                projectPMEvaluationDto.getEvaluator(), projectPMEvaluationDto.getEvaluated());
    }
}
