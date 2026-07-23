package com.shruti.ems.service.impl;

import com.shruti.ems.dto.EmployeeDTO;
import com.shruti.ems.entity.Employee;
import com.shruti.ems.exception.ResourceNotFoundException;
import com.shruti.ems.repository.EmployeeRepository;
import com.shruti.ems.service.EmployeeService;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final ModelMapper modelMapper;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository,
                               ModelMapper modelMapper) {
        this.employeeRepository = employeeRepository;
        this.modelMapper = modelMapper;
    }

    // =========================
    // Save Employee
    // =========================
    @Override
    public EmployeeDTO saveEmployee(EmployeeDTO employeeDTO) {

        Employee employee = modelMapper.map(employeeDTO, Employee.class);

        Employee savedEmployee = employeeRepository.save(employee);

        return modelMapper.map(savedEmployee, EmployeeDTO.class);
    }

    // =========================
    // Get All Employees
    // =========================
    @Override
    public List<EmployeeDTO> getAllEmployees() {

        List<Employee> employees = employeeRepository.findAll();

        return employees.stream()
                .map(employee -> modelMapper.map(employee, EmployeeDTO.class))
                .collect(Collectors.toList());
    }

    // =========================
    // Search By First Name
    // =========================
    @Override
    public List<EmployeeDTO> getEmployeesByFirstName(String firstName) {

        List<Employee> employees = employeeRepository.findByFirstName(firstName);

        return employees.stream()
                .map(employee -> modelMapper.map(employee, EmployeeDTO.class))
                .collect(Collectors.toList());
    }

    // =========================
    // JPQL Search
    // =========================
    @Override
    public List<EmployeeDTO> getEmployeesByFirstNameJPQL(String firstName) {

        List<Employee> employees =
                employeeRepository.findEmployeesByFirstNameJPQL(firstName);

        return employees.stream()
                .map(employee -> modelMapper.map(employee, EmployeeDTO.class))
                .collect(Collectors.toList());
    }

    // =========================
    // Native SQL Search
    // =========================
    @Override
    public List<EmployeeDTO> getEmployeesByFirstNameNative(String firstName) {

        List<Employee> employees =
                employeeRepository.findEmployeesByFirstNameNative(firstName);

        return employees.stream()
                .map(employee -> modelMapper.map(employee, EmployeeDTO.class))
                .collect(Collectors.toList());
    }

    // =========================
    // Pagination
    // =========================
    @Override
    public Page<EmployeeDTO> getEmployeesWithPagination(int pageNo, int pageSize) {

        Pageable pageable = PageRequest.of(pageNo, pageSize);

        Page<Employee> employeePage = employeeRepository.findAll(pageable);

        return employeePage.map(employee ->
                modelMapper.map(employee, EmployeeDTO.class));
    }

    // =========================
    // Sorting By First Name
    // =========================
    @Override
    public List<EmployeeDTO> getEmployeesSortedByFirstName() {

        List<Employee> employees =
                employeeRepository.findAll(Sort.by("firstName").ascending());

        return employees.stream()
                .map(employee -> modelMapper.map(employee, EmployeeDTO.class))
                .collect(Collectors.toList());
    }

    // =========================
    // Sorting By Last Name Desc
    // =========================
    @Override
    public List<EmployeeDTO> getEmployeesSortedByLastNameDesc() {

        List<Employee> employees =
                employeeRepository.findAll(Sort.by("lastName").descending());

        return employees.stream()
                .map(employee -> modelMapper.map(employee, EmployeeDTO.class))
                .collect(Collectors.toList());
    }

    // =========================
    // Get Employee By ID
    // =========================
    @Override
    public EmployeeDTO getEmployeeById(Long employeeId) {

        Employee employee = employeeRepository.findById(employeeId)
                .orElseThrow(() ->
                        new ResourceNotFoundException(
                                "Employee not found with id : " + employeeId));

        return modelMapper.map(employee, EmployeeDTO.class);
    }

    // =========================
    // Update Employee
    // =========================
    @Override
    public EmployeeDTO updateEmployee(EmployeeDTO employeeDTO, Long id) {

        Employee existingEmployee = employeeRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException(
                                "Employee not found with id : " + id));

        existingEmployee.setFirstName(employeeDTO.getFirstName());
        existingEmployee.setLastName(employeeDTO.getLastName());
        existingEmployee.setEmail(employeeDTO.getEmail());

        Employee updatedEmployee = employeeRepository.save(existingEmployee);

        return modelMapper.map(updatedEmployee, EmployeeDTO.class);
    }

    // =========================
    // Delete Employee
    // =========================
    @Override
    public void deleteEmployee(Long id) {

        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException(
                                "Employee not found with id : " + id));

        employeeRepository.delete(employee);
    }


}