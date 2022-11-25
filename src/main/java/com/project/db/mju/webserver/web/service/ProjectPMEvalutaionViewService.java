package com.project.db.mju.webserver.web.service;

import com.project.db.mju.webserver.web.domain.Employee;
import com.project.db.mju.webserver.web.domain.ProjectPMEvaluation;
import com.project.db.mju.webserver.web.dto.ProjectPMEvaluationDto;
import com.project.db.mju.webserver.web.dto.ProjectPMEvaluationViewDto;
import com.project.db.mju.webserver.web.dto.ProjectPMEvaluationViewRequestDto;
import com.project.db.mju.webserver.web.repository.ProjectPMEvaluationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class ProjectPMEvalutaionViewService {

    @Autowired
    ProjectPMEvaluationRepository pmEvaluationRepository;

    @Autowired
    EmployeeService employeeService;

    public List<ProjectPMEvaluationViewDto> getAllEvals(ProjectPMEvaluationViewRequestDto requestDto) {
        Employee evaluator = employeeService.getByName(requestDto.getEvaluatorName());

        Collection<ProjectPMEvaluation> eval = pmEvaluationRepository.getAllPmEvaluations(requestDto.getProjectId(), evaluator.getId());
        List<ProjectPMEvaluationViewDto> dtos = new ArrayList<>();

        for (ProjectPMEvaluation c: eval) {
            dtos.add(new ProjectPMEvaluationViewDto(
                    c.getProjectId(),
                    employeeService.getById(c.getEvaluator()).getName(),
                    employeeService.getById(c.getEvaluated()).getName(),
                    c.getCommunicationComment(),
                    c.getBusinessComment(),
                    c.getCommunicationRate(),
                    c.getBusinessRate()
            ));
        }

        return dtos;

    }
}
