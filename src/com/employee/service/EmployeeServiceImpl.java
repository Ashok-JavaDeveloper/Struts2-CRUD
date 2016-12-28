package com.employee.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.employee.dao.EmployeeDAO;
import com.foundation.domain.Employee;
import com.foundation.domain.Mobile;
import com.init.SessionCreator;

public class EmployeeServiceImpl extends SessionCreator implements EmployeeService
{
	public Employee saveEmployee(Employee employee)
	{
		if(employee != null)
		{
			SqlSession session = getDBSession();
			if(session != null)
			{
				EmployeeDAO mapper = session.getMapper(EmployeeDAO.class);
				if(employee.getId() <= 0)
				{
					mapper.insertEmployee(employee);
				}
				else
				{
					mapper.updateEmployee(employee);
				}
				
				/*String[] mobileList = employee.getMobile();
				Mobile mobile;
				if(mobileList != null)
				{
					for(int i =0 ; i < mobileList.length; i++)
					{
						mobile = new Mobile();
						mobile.setEmployeeId(employee.getId());
						mobile.setMobileNo(mobileList[i]);
						mapper.insertMobile(mobile);
					}
				}*/
				session.commit();
			}
			closeDBSession(session);
		}
		return employee;
	}

	public List<Employee> getEmployees()
	{
		List<Employee> employeeList = null;
		
		SqlSession session = getDBSession();
		if(session != null)
		{
			EmployeeDAO mapper = session.getMapper(EmployeeDAO.class);
			employeeList = mapper.getEmployees();
		}
		return employeeList;
	}

	public Employee getEmployee(int employeeId)
	{
		Employee employee = null;
		
		if(employeeId >0)
		{
			SqlSession session = getDBSession();
			if(session != null)
			{
				EmployeeDAO mapper = session.getMapper(EmployeeDAO.class);
				employee = mapper.getEmployee(employeeId);
			}
			closeDBSession(session);
		}
		return employee;
	}

	public void deleteEmployee(int employeeId)
	{
		if(employeeId > 0)
		{
			SqlSession session = getDBSession();
			if(session != null)
			{
				EmployeeDAO mapper = session.getMapper(EmployeeDAO.class);
				mapper.deleteEmployee(employeeId);
			}
			session.commit();
			closeDBSession(session);
		}
	}

	
	public List<Mobile> getMobilesByEmpId(int employeeId)
	{
		List<Mobile> mobiles = null;
		if(employeeId > 0)
		{
			SqlSession session = getDBSession();
			if(session != null)
			{
				EmployeeDAO mapper = session.getMapper(EmployeeDAO.class);
				mobiles = mapper.getMobilesByEmpId(employeeId);
			}
		}
		return mobiles;
	}

}
