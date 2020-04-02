package com.nep.onlinelesson.controller;

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
//		Employee employee1 = new Employee(200001, "00-123456", "Jailani", 2000.99, Calendar.getInstance());
//		empRepo.save(employee1);
//		Employee employee2 = new Employee(200002, "00-654321", "Rahman", 3000.99, Calendar.getInstance());
//		empRepo.save(employee2);
		return "employees";
	}
	
}
