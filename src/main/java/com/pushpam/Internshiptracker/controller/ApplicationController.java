package com.pushpam.Internshiptracker.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.pushpam.Internshiptracker.entity.Application;
import com.pushpam.Internshiptracker.service.ApplicationService;
import org.springframework.http.MediaType;

@RestController
@RequestMapping("/applications")
public class ApplicationController {

    private final ApplicationService service;

    public ApplicationController(ApplicationService service) {
        this.service = service;
    }

   @PostMapping(
    consumes = MediaType.APPLICATION_JSON_VALUE,
    produces = MediaType.APPLICATION_JSON_VALUE
)

    public Application addApplication(@RequestBody Application application) {
        return service.addApplication(application);
    }

    @GetMapping
    public List<Application> getAllApplications() {
        return service.getAllApplications();
    }

    @GetMapping("/{id}")
    public Application getApplicationById(@PathVariable Long id) {
        return service.getApplicationById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteApplication(@PathVariable Long id) {
        service.deleteApplication(id);
    }
}
