# Internship Application Tracker
A full-stack web application to track internship applications and their statuses.

## Why this project?
While applying to multiple internships, it became difficult to track application status across companies.  
This project solves that problem using a backend-first approach.

## Features
- Add internship applications with company, role, status, and notes
- View all applications in one place
- Status restricted using enums to prevent invalid data
- Lightweight frontend consuming REST APIs

## Tech Stack
- Backend: Java, Spring Boot, Spring Data JPA
- Frontend: HTML, CSS, JavaScript
- Database: H2 (in-memory)
- API Style: REST

## Architecture
- Controller layer handles HTTP requests
- Service layer contains business logic
- Repository layer manages database access

## How to Run
1. Clone the repository
2. Run the Spring Boot application
3. Open `http://localhost:8080/index.html` in a browser

## Future Improvements
- Authentication and authorization
- Pagination and filtering
- Persistent database
- Deployment to cloud

