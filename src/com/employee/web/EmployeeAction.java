package com.employee.web;

import java.util.List;

import com.employee.service.EmployeeService;
import com.foundation.domain.Employee;
import com.foundation.domain.Mobile;
import com.init.StrutsActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class EmployeeAction extends StrutsActionSupport implements Preparable, ModelDriven<Employee>
{
	private static final long serialVersionUID = 1L;
	private int employeeId;
	private Employee employee;
	private List<Employee> employees;
	private List<Mobile> mobileList;
	
	private EmployeeService employeeService;
	
	public String addEmployee()
	{
		return SUCCESS;
	}
 
	public String saveEmployee()
	{
		employeeService.saveEmployee(employee);
		return SUCCESS;
	}
	
	public String dashboard()
	{
		return SUCCESS;
	}

	public String viewEmployee()
	{
		employees = employeeService.getEmployees();  
		return SUCCESS;
	}
	
	public String editEmployee()
	{
		employee = employeeService.getEmployee(employeeId);
//		mobileList = employeeService.getMobilesByEmpId(employeeId);
		return SUCCESS;
	}
	
	public String deleteEmployee()
	{
		employeeService.deleteEmployee(employeeId);		
		return SUCCESS;
	}
	
	public String detailEmployee()
	{
//		mobileList = employeeService.getMobilesByEmpId(employeeId);
		return SUCCESS;
	}
	
	public Employee getModel()
	{
		return employee;
	}

	public void prepare() throws Exception
	{
		employee = new Employee();
	}
	
	public Employee getEmployee()
	{
		return employee;
	}
	
	public List<Employee> getEmployees()
	{
		return employees;
	}

	public void setEmployeeId(int employeeId)
	{
		this.employeeId = employeeId;
	}

	public EmployeeService getEmployeeService() {
		return employeeService;
	}

	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	
	public List<Mobile> getMobileList() {
		return mobileList;
	}
	public void setMobileList(List<Mobile> mobileList) {
		this.mobileList = mobileList;
	}
}

