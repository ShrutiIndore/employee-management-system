package com.shruti.ems.service;

import com.shruti.ems.entity.Employee;
import java.util.List;

public interface EmployeeService
{
    Employee saveEmployee(Employee employee);

    List<Employee> getAllEmployees();
}
