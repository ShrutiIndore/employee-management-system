package com.shruti.ems.repository;

import com.shruti.ems.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long>
{
    List<Employee> findByFirstName(String firstName);

    @Query("SELECT e FROM Employee e WHERE e.firstName = :firstName")
    List<Employee> findEmployeesByFirstNameJPQL(String firstName);

    @Query(value = "SELECT * FROM employees WHERE first_name = :firstName",
            nativeQuery = true
    )
    List<Employee> findEmployeesByFirstNameNative(String firstName);

}
