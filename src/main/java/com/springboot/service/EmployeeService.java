package com.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.entity.Employee;
import com.springboot.repository.EmployeeRepository;

@Service
public class EmployeeService{

	@Autowired
	private EmployeeRepository repository;

	public Employee saveEmployee(Employee employee) {
		return repository.save(employee);
	}

	public List<Employee> getEmployees(){
		return repository.findByOrderBySalaryDescNameAsc();
	}

	public Employee getEmployeeById(int id){
		return repository.findById(id).orElse(null);
	}

	public Employee updateEmployee(Integer salary, Integer id) {
		Employee existingEmployee = repository.findById(id).get();
		existingEmployee.setSalary(salary);
		return repository.save(existingEmployee);
	}

	public Optional<Employee> checkEmployee(int id){
		return repository.findById(id);
	}

}
