package com.codeclan.example.employeesservice.repositories;

import com.codeclan.example.employeesservice.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
