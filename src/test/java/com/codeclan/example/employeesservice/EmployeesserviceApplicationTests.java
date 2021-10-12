package com.codeclan.example.employeesservice;

import com.codeclan.example.employeesservice.models.Employee;
import com.codeclan.example.employeesservice.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class EmployeesserviceApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployee(){
		Employee jeremy = new Employee("dasd", 32, "eamil", 4321);
		employeeRepository.save(jeremy);
	}
}
