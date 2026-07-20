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

- Learned the purpose of ResponseEntity in Spring Boot.
- Implemented ResponseEntity in all REST APIs.
- Updated POST API to return HTTP Status 201 (Created).
- Updated GET APIs to return HTTP Status 200 (OK).
- Updated PUT API to return HTTP Status 200 (OK).
- Updated DELETE API to return HTTP Status 200 (OK).
- Improved REST API response handling by returning proper HTTP status codes.
- Tested all CRUD APIs successfully using Postman.

---

## ✅ Day 6 - Validation & Global Exception Handling

### Topics Learned
- Bean Validation
- @Valid
- @NotBlank
- @Size
- @Email
- Global Exception Handling
- MethodArgumentNotValidException
- Custom Validation Error Responses

### Features Implemented
- Added validation for employee fields.
- Prevented invalid data from being stored.
- Implemented custom validation error responses.
- Handled ResourceNotFoundException globally.
- Tested validation and exception handling using Postman.

---

# Day 7 - Swagger API Documentation

## Objectives
- Learn what Swagger is
- Integrate Swagger with Spring Boot
- Generate REST API documentation automatically
- Test APIs directly from the browser

---

## What I Learned
- What is Swagger/OpenAPI
- How Swagger integrates with Spring Boot
- How to add Swagger dependency using Maven
- How Swagger automatically scans REST Controllers
- How to test APIs using Swagger UI
- Difference between Postman and Swagger
- API documentation using OpenAPI Specification

---

## Dependency Added

```xml
<dependency>
    <groupId>org.springdoc</groupId>
    <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
    <version>2.8.9</version>
</dependency>
```

---

## Swagger URL

```
http://localhost:8080/swagger-ui/index.html
```

---

## OpenAPI JSON

```
http://localhost:8080/v3/api-docs
```

---

## APIs Available

- POST /api/employees
- GET /api/employees
- GET /api/employees/{id}
- PUT /api/employees/{id}
- DELETE /api/employees/{id}

---

## Features Implemented

- API Documentation
- Interactive Swagger UI
- Automatic Endpoint Discovery
- CRUD API Testing
- OpenAPI 3.1 Support

---

## Technologies Used

- Java 25
- Spring Boot 4.1.0
- Spring Web MVC
- Spring Data JPA
- MySQL
- Maven
- Swagger (Springdoc OpenAPI)

---

## Learning Outcome

- Understood API documentation.
- Learned how Swagger works with Spring Boot.
- Tested REST APIs without using Postman.
- Learned how Swagger automatically generates documentation from Controller classes.
- Improved understanding of REST API development.

---

## Project Status

✅ Employee CRUD Operations Completed

✅ Validation Implemented

✅ Global Exception Handling Implemented

✅ Swagger API Documentation Added

✅ Project Successfully Running

---

## 📅 Day 9 - JPQL Queries using @Query

### ✅ Topics Covered
- Introduction to JPQL (Java Persistence Query Language)
- Difference between SQL and JPQL
- Using @Query annotation
- Named Parameters in JPQL
- Custom Repository Query
- Testing JPQL APIs using Postman & Swagger

### ✅ Features Implemented
- Search Employee by First Name using JPQL
- Created custom repository method with @Query
- Added Service & Controller support
- Tested successfully in Swagger UI

### 📌 JPQL Query

```java
@Query("SELECT e FROM Employee e WHERE e.firstName = :firstName")
List<Employee> findEmployeesByFirstNameJPQL(String firstName);

```
---

## 📅 Learning Progress

- ✅ Day 1 – Spring Boot Project Setup & MySQL Database Connection
- ✅ Day 2 – Repository Layer & Service Layer
- ✅ Day 3 – REST Controller, POST API & GET APIs
- ✅ Day 4 – PUT API, DELETE API & Custom Exception Handling
- ✅ Day 5 – ResponseEntity, HTTP Status Codes & CRUD Testing
- ✅ Day 6 – Bean Validation & Global Exception Handling
- ✅ Day 7 – Swagger (OpenAPI) Integration & API Documentation
- ⏳ Day 8 – Spring Data JPA Custom Queries
- ✅ Day 9 – JPQL Queries using @Query
- ⏳ Day 10 – Native SQL Queries

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
