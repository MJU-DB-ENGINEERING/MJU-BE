package com.project.db.mju.webserver.web.repository;

import com.project.db.mju.webserver.web.domain.ProjectDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectDetailRepository extends JpaRepository<ProjectDetail, Long> {
}
