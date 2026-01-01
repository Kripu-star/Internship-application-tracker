package com.pushpam.Internshiptracker.entity;

import com.pushpam.Internshiptracker.enums.ApplicationStatus;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Application {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private ApplicationStatus status;

    private String companyName;
    private String role;
   
    private String notes;

    public Application() {
    }

    public Long getId() {
        return id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public ApplicationStatus getStatus() {
    return status;
}

public void setStatus(ApplicationStatus status) {
    this.status = status;
}


    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
