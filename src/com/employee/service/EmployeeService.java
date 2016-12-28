package com.employee.service;

import java.util.List;

import com.foundation.domain.Employee;
import com.foundation.domain.Mobile;

public interface EmployeeService
{
	public Employee saveEmployee(Employee employee);
	
	public List<Employee> getEmployees();

	public Employee getEmployee(int employeeId);
	
	public void deleteEmployee(int employeeId);
	
	public List<Mobile> getMobilesByEmpId(int employeeId);
}
