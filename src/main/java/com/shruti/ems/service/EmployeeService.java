package com.shruti.ems.service;

import com.shruti.ems.entity.Employee;
import org.springframework.data.domain.Page;

import java.util.List;

public interface EmployeeService
{
    Employee saveEmployee(Employee employee);

    List<Employee> getAllEmployees();

    List<Employee> getEmployeesByFirstName(String firstName);

    List<Employee> getEmployeesByFirstNameJPQL(String firstName);

    List<Employee> getEmployeesByFirstNameNative(String firstName);

    Employee getEmployeeById(Long employeeId);

    Employee updateEmployee(Employee employee, Long id);

    void deleteEmployee(Long id);

    Page<Employee> getEmployeesWithPagination(int pageNo, int pageSize);

    List<Employee> getEmployeesSortedByFirstName();

    List<Employee> getEmployeesSortedByLastNameDesc();
}
