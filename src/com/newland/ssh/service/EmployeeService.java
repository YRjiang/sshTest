package com.newland.ssh.service;

import com.newland.ssh.domain.Employee;

/*
 * 员工管理 的 业务层接口
 */
public interface EmployeeService {
	Employee login(Employee employee);
}
