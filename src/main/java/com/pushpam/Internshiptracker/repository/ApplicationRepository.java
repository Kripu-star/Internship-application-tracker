package com.pushpam.Internshiptracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pushpam.Internshiptracker.entity.Application;

public interface ApplicationRepository extends JpaRepository<Application, Long> {
}
