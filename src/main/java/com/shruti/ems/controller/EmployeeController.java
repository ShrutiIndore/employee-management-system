package com.shruti.ems.controller;

import com.shruti.ems.dto.EmployeeDTO;
import com.shruti.ems.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;

@Tag(
        name = "Employee Management System",
        description = "CRUD REST APIs for Employee Management"
)
@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    // Save Employee
    @Operation(
            summary = "Create Employee",
            description = "Creates a new employee in database"
    )
    @PostMapping
    public ResponseEntity<EmployeeDTO> saveEmployee(
            @Valid @RequestBody EmployeeDTO employeeDTO) {

        EmployeeDTO savedEmployee = employeeService.saveEmployee(employeeDTO);

        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }

    // Get All Employees
    @Operation(
            summary = "Get All Employees",
            description = "Returns list of all employees"
    )
    @GetMapping
    public ResponseEntity<List<EmployeeDTO>> getAllEmployees() {

        List<EmployeeDTO> employees = employeeService.getAllEmployees();

        return ResponseEntity.ok(employees);
    }

    // Search By First Name (Derived Query)
    @Operation(
            summary = "Search Employee",
            description = "Search employee by first name"
    )
    @GetMapping("/search")
    public ResponseEntity<List<EmployeeDTO>> getEmployeesByFirstName(
            @RequestParam String firstName) {

        List<EmployeeDTO> employees =
                employeeService.getEmployeesByFirstName(firstName);

        return ResponseEntity.ok(employees);
    }

    // Search By First Name (JPQL)
    @Operation(
            summary = "Search Employee",
            description = "Search employee by first name"
    )
    @GetMapping("/search-jpql")
    public ResponseEntity<List<EmployeeDTO>> getEmployeesByFirstNameJPQL(
            @RequestParam String firstName) {

        List<EmployeeDTO> employees =
                employeeService.getEmployeesByFirstNameJPQL(firstName);

        return ResponseEntity.ok(employees);
    }

    // Search By First Name (Native SQL)
    @Operation(
            summary = "Search Employee",
            description = "Search employee by first name"
    )
    @GetMapping("/search-native")
    public ResponseEntity<List<EmployeeDTO>> getEmployeesByFirstNameNative(
            @RequestParam String firstName) {

        List<EmployeeDTO> employees =
                employeeService.getEmployeesByFirstNameNative(firstName);

        return ResponseEntity.ok(employees);
    }

    // Get Employee By ID
    @Operation(
            summary = "Get Employee By ID",
            description = "Returns employee using employee id"
    )
    @GetMapping("/{id}")
    public ResponseEntity<EmployeeDTO> getEmployeeById(
            @PathVariable("id") Long employeeId) {

        EmployeeDTO employee =
                employeeService.getEmployeeById(employeeId);

        return ResponseEntity.ok(employee);
    }

    // Update Employee
    @Operation(
            summary = "Update Employee",
            description = "Updates employee details"
    )
    @PutMapping("/{id}")
    public ResponseEntity<EmployeeDTO> updateEmployee(
            @PathVariable("id") Long employeeId,
            @Valid @RequestBody EmployeeDTO employeeDTO) {

        EmployeeDTO updatedEmployee =
                employeeService.updateEmployee(employeeDTO, employeeId);

        return ResponseEntity.ok(updatedEmployee);
    }

    // Delete Employee
    @Operation(
            summary = "Delete Employee",
            description = "Deletes employee by id"
    )
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteEmployee(
            @PathVariable("id") Long employeeId) {

        employeeService.deleteEmployee(employeeId);

        return ResponseEntity.ok("Employee deleted successfully!");
    }

    // Pagination
    @Operation(
            summary = "Pagination",
            description = "Returns employees page-wise"
    )
    @GetMapping("/pagination")
    public ResponseEntity<Page<EmployeeDTO>> getEmployeesWithPagination(
            @RequestParam int pageNo,
            @RequestParam int pageSize) {

        return ResponseEntity.ok(
                employeeService.getEmployeesWithPagination(pageNo, pageSize)
        );
    }

    // Sort By First Name
    @Operation(
            summary = "Sort Employees",
            description = "Sort employees by first name"
    )
    @GetMapping("/sort/firstname")
    public ResponseEntity<List<EmployeeDTO>> getEmployeesSortedByFirstName() {

        return ResponseEntity.ok(
                employeeService.getEmployeesSortedByFirstName()
        );
    }

    // Sort By Last Name Descending
    @Operation(
            summary = "Sort Employees Desc",
            description = "Sort employees by last name descending"
    )
    @GetMapping("/sort/lastname")
    public ResponseEntity<List<EmployeeDTO>> getEmployeesSortedByLastNameDesc() {

        return ResponseEntity.ok(
                employeeService.getEmployeesSortedByLastNameDesc()
        );
    }
}