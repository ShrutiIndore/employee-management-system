# Employee Management System

A **Spring Boot REST API** project for managing employee records using **Java, Spring Boot, Spring Data JPA, Hibernate, and MySQL**.

---

## 🚀 Tech Stack

- Java 25
- Spring Boot 4
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- IntelliJ IDEA
- Git
- GitHub
- Postman

---

## 📁 Project Structure

```
src
├── controller
├── entity
├── repository
├── service
│   └── impl
└── resources
```

---

# ✅ Day 1 - Project Setup

### Work Completed

- Created Spring Boot project
- Configured Maven dependencies
- Connected MySQL database
- Created Employee Entity
- Configured JPA and Hibernate
- Successfully ran the application
- Uploaded project to GitHub

---

# ✅ Day 2 - Repository & Service Layer

### Work Completed

- Created EmployeeRepository using JpaRepository
- Created EmployeeService interface
- Created EmployeeServiceImpl class
- Implemented saveEmployee() method
- Implemented getAllEmployees() method
- Learned Dependency Injection using Constructor Injection
- Successfully tested the application
- Uploaded Day 2 code to GitHub

---

# ✅ Day 3 - REST API Development

### Work Completed

- Created EmployeeController
- Implemented POST API to save employee details
- Implemented GET API to retrieve all employees
- Implemented GET API to retrieve employee by ID
- Tested all APIs using Postman
- Added and verified employee records in MySQL Workbench
- Learned basic SQL commands (SELECT, INSERT, TRUNCATE)
- Connected Controller → Service → Repository → MySQL

### APIs Completed

#### Create Employee

```
POST /api/employees
```

#### Get All Employees

```
GET /api/employees
```

#### Get Employee By ID

```
GET /api/employees/{id}
```

---

## ✅ Day 4 - Update, Delete & Exception Handling

- Implemented PUT API to update employee details.
- Implemented DELETE API to remove employee records.
- Created custom exception class (ResourceNotFoundException).
- Implemented Global Exception Handler using @RestControllerAdvice.
- Improved error handling for invalid employee IDs.
- Returned meaningful error messages when employee is not found.
- Tested PUT and DELETE APIs using Postman.
- Successfully verified CRUD operations with MySQL.

---

## ✅ Day 5 - ResponseEntity & HTTP Status Codes

- Implemented ResponseEntity in all REST APIs.
- Returned proper HTTP status codes.
- POST API returns 201 Created.
- GET APIs return 200 OK.
- PUT API returns 200 OK.
- DELETE API returns 200 OK.
- Improved REST API response handling.
- Tested all APIs successfully using Postman.

---


## 📅 Learning Progress

- ✅ Day 1 - Spring Boot Project Setup & MySQL Connection
- ✅ Day 2 - Repository & Service Layer
- ✅ Day 3 - Controller Layer, POST API, GET APIs
- ✅ Day 4 - PUT API, DELETE API, Custom Exception & Global Exception Handler
- ✅ Day 5 - ResponseEntity & HTTP Status Codes
- ⏳ Day 6 - Validation (@Valid, @NotBlank, @Email, @Size)
- ⏳ Day 7 - Final Testing, Documentation & Project Completion
---

## 🎯 Features Completed

- ✅ Spring Boot Project Setup
- ✅ MySQL Database Integration
- ✅ Spring Data JPA
- ✅ Hibernate ORM
- ✅ Employee Entity
- ✅ Repository Layer
- ✅ Service Layer
- ✅ REST Controller
- ✅ Create Employee API
- ✅ Get All Employees API
- ✅ Get Employee By ID API
- ✅ Postman API Testing

---

## 👩‍💻 Developer

**Shruti Indore**
