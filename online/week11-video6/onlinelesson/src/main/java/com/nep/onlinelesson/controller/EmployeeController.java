package com.nep.onlinelesson.controller;

import java.util.Arrays;
import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nep.onlinelesson.data.EmployeeRepository;
import com.nep.onlinelesson.model.Employee;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeRepository empRepo;
	
	@RequestMapping(value="/")
	private String employees() {
		// Adding employee data to employee table
//		Employee employee1 = new Employee(200001, "00-123456", "Jailani", 2000.99, Calendar.getInstance());
//		empRepo.save(employee1);
//		Employee employee2 = new Employee(200002, "00-654321", "Rahman", 3000.99, Calendar.getInstance());
//		empRepo.save(employee2);
		
		// Retrieve employee data from employee table
//		Employee employee = empRepo.findById(200001).get();
//		System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getIcNumber());
		
//		Iterable<Employee> employees = empRepo.findAll();
//		for(Employee e : employees) {
//			System.out.println(e.getId() + " " + e.getName() + " " + e.getIcNumber());
//		}
//		
//		Iterable<Employee> employeesSpecific = empRepo.findAllById(Arrays.asList(200001, 200003));
//		for(Employee eS : employeesSpecific) {
//			System.out.println(eS.getId() + " " + eS.getName() + " " + eS.getIcNumber());
//		}
		
		// Edit employee data from employee table
//		Employee employee2 = empRepo.findById(200002).get();
//		employee2.setName("Abdul");
//		empRepo.save(employee2);
		
		// Delete employee data from employee table
//		Employee employee2 = empRepo.findById(200002).get();
//		empRepo.delete(employee2);
		
//		empRepo.deleteById(200002);
		
//		empRepo.deleteAll();
		
		return "employees";
	}
	
}
