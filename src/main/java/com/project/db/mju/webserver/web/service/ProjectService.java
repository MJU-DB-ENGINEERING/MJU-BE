package com.project.db.mju.webserver.web.service;

import com.project.db.mju.webserver.web.domain.Project;
import com.project.db.mju.webserver.web.dto.ProjectDto;
import com.project.db.mju.webserver.web.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {
    @Autowired
    private ProjectRepository projectRepository;

    public ProjectDto findProjectByProjectName(String name) {
        final Project project = projectRepository.findProjectByProjectName(name);

        return new ProjectDto(project);
    }
}
