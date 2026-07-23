package com.shruti.ems.service;

import com.shruti.ems.dto.EmployeeDTO;
import org.springframework.data.domain.Page;

import java.util.List;

public interface EmployeeService
{
    EmployeeDTO saveEmployee(EmployeeDTO employeeDto);

    List<EmployeeDTO> getAllEmployees();

    List<EmployeeDTO> getEmployeesByFirstName(String firstName);

    List<EmployeeDTO> getEmployeesByFirstNameJPQL(String firstName);

    List<EmployeeDTO> getEmployeesByFirstNameNative(String firstName);

    EmployeeDTO getEmployeeById(Long employeeId);

    EmployeeDTO updateEmployee(EmployeeDTO employeeDto, Long id);

    void deleteEmployee(Long id);

    Page<EmployeeDTO> getEmployeesWithPagination(int pageNo, int pageSize);

    List<EmployeeDTO> getEmployeesSortedByFirstName();

    List<EmployeeDTO> getEmployeesSortedByLastNameDesc();
}