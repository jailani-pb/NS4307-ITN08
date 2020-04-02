package com.nep.onlinelesson.data;

import org.springframework.data.repository.CrudRepository;

import com.nep.onlinelesson.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
