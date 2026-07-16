package com.shruti.ems.service.impl;

import com.shruti.ems.entity.Employee;
import com.shruti.ems.repository.EmployeeRepository;
import com.shruti.ems.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService
{
    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository)
    {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(Long employeeId) {

        return employeeRepository.findById(employeeId).orElse(null);

    }

    @Override
    public Employee updateEmployee(Employee employee, Long id) {

        Employee existingEmployee = employeeRepository.findById(id).orElse(null);

        existingEmployee.setFirstName(employee.getFirstName());
        existingEmployee.setLastName(employee.getLastName());
        existingEmployee.setEmail(employee.getEmail());

        employeeRepository.save(existingEmployee);

        return existingEmployee;
    }

}
