package com.project.db.mju.webserver.web.repository;

import com.project.db.mju.webserver.web.domain.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends JpaRepository<Job, Long> {
}
