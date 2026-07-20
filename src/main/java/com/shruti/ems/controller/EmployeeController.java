package com.shruti.ems.controller;

import com.shruti.ems.entity.Employee;
import com.shruti.ems.service.EmployeeService;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import jakarta.validation.Valid;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping
    public ResponseEntity<Employee> saveEmployee(@Valid @RequestBody Employee employee) {

        Employee savedEmployee = employeeService.saveEmployee(employee);

        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Employee>> getAllEmployees() {

        List<Employee> employees = employeeService.getAllEmployees();

        return ResponseEntity.ok(employees);
    }

    @GetMapping("/search")
    public ResponseEntity<List<Employee>> getEmployeesByFirstName(
            @RequestParam String firstName)
    {
        List<Employee> employees =
                employeeService.getEmployeesByFirstName(firstName);

        return ResponseEntity.ok(employees);
    }

    @GetMapping("/search-jpql")
    public ResponseEntity<List<Employee>> getEmployeesByFirstNameJPQL(
            @RequestParam String firstName)
    {
        List<Employee> employees =
                employeeService.getEmployeesByFirstNameJPQL(firstName);

        return ResponseEntity.ok(employees);
    }

    @GetMapping("/search-native")
    public ResponseEntity<List<Employee>> getEmployeesByFirstNameNative(
            @RequestParam String firstName)
    {
        List<Employee> employees =
                employeeService.getEmployeesByFirstNameNative(firstName);

        return ResponseEntity.ok(employees);
    }

    @GetMapping("{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") Long employeeId) {

        Employee employee = employeeService.getEmployeeById(employeeId);

        return ResponseEntity.ok(employee);
    }

    @PutMapping("{id}")
    public ResponseEntity<Employee> updateEmployee(
            @PathVariable("id") Long employeeId,
            @Valid @RequestBody Employee employee) {

        Employee updatedEmployee =
                employeeService.updateEmployee(employee, employeeId);

        return ResponseEntity.ok(updatedEmployee);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteEmployee(
            @PathVariable("id") Long employeeId) {

        employeeService.deleteEmployee(employeeId);

        return ResponseEntity.ok("Employee deleted successfully!");
    }
}