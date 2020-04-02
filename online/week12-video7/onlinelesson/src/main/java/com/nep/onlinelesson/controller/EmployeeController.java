package com.nep.onlinelesson.controller;

import java.util.Arrays;
import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nep.onlinelesson.data.EmployeeRepository;
import com.nep.onlinelesson.model.Employee;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeRepository empRepo;
	
	@RequestMapping(value="/")
	public String employees(ModelMap modelMap) {
		Iterable<Employee> employeeList = empRepo.findAll();
		modelMap.put("employees", employeeList);
		return "employees";
	}
	
}
