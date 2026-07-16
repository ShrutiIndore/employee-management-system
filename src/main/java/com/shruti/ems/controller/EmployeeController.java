package com.shruti.ems.controller;

import com.shruti.ems.entity.Employee;
import com.shruti.ems.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping
    public Employee saveEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("{id}")
    public Employee getEmployeeById(@PathVariable("id") Long employeeId)
    {
        return employeeService.getEmployeeById(employeeId);
    }

    @PutMapping("{id}")
    public Employee updateEmployee(@PathVariable("id") Long employeeId,
                                   @RequestBody Employee employee) {

        return employeeService.updateEmployee(employee, employeeId);
    }
}