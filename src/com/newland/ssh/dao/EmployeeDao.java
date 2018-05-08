package com.newland.ssh.dao;

import com.newland.ssh.domain.Employee;

/*
 * 员工管理的DAO 接口
 */
public interface EmployeeDao {
	Employee findByUsernameAndPassword(Employee employee); 
}