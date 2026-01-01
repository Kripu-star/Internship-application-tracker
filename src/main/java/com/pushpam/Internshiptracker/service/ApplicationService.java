package com.pushpam.Internshiptracker.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pushpam.Internshiptracker.entity.Application;
import com.pushpam.Internshiptracker.repository.ApplicationRepository;

@Service
public class ApplicationService {

    private final ApplicationRepository repository;

    public ApplicationService(ApplicationRepository repository) {
        this.repository = repository;
    }

    public Application addApplication(Application application) {
        return repository.save(application);
    }

    public List<Application> getAllApplications() {
        return repository.findAll();
    }

    public Application getApplicationById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deleteApplication(Long id) {
        repository.deleteById(id);
    }
}
