package com.newland.ssh.service.Impl;

import com.newland.ssh.dao.EmployeeDao;
import com.newland.ssh.domain.Employee;
import com.newland.ssh.service.EmployeeService;


/*
 * 员工管理的业务层实现类
 * 业务中 注入 dao 
 */
public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeDao employeeDao;
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
	
	
	/**
	 * 业务层登入的方法
	 */
	@Override
	public Employee login(Employee employee) {
		// TODO Auto-generated method stub
		
		Employee existEmployee = employeeDao.findByUsernameAndPassword(employee);
		return existEmployee;
	}
}
