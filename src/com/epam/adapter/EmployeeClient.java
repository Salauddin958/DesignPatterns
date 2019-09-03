package com.epam.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {
	public List<Employee> getEmployeeList() {
		List<Employee> employees = new ArrayList<>();
		Employee employeeDB = new EmployeeDB("123", "abc", "def", "a@b");
		employees.add(employeeDB);
		EmployeeLdap instance = new EmployeeLdap("1231", "abc1", "def1", "a@b1");
		Employee employeeLdap = new EmployeeAdapterLdap(instance);
		employees.add(employeeLdap);
		return employees;
	}
}
