package com.employee.dao;

import java.util.List;

import com.foundation.domain.Employee;
import com.foundation.domain.Mobile;

public interface EmployeeDAO
{
	public int insertEmployee(Employee employee);

	public int updateEmployee(Employee employee);
	
	public List<Employee> getEmployees();
	
	public Employee getEmployee(int employeeId);
	
	public int deleteEmployee(int employeeId);
	
	public int insertMobile(Mobile mobile);
	
	public List<Mobile> getMobilesByEmpId(int employeeId);
}
