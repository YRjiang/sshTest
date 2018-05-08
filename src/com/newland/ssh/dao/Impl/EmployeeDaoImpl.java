package com.newland.ssh.dao.Impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.newland.ssh.dao.EmployeeDao;
import com.newland.ssh.domain.Employee;

/*
 * 员工管理的DAO 实现类
 * dao 中使用 模板 ，需要继承 HibernateDaoSupport
 */
public class EmployeeDaoImpl extends HibernateDaoSupport implements EmployeeDao {

	/**
	 * DAO 中根据用户名 和 密码 查询用户的方法
	 */
	@Override
	public Employee findByUsernameAndPassword(Employee employee) {
		// TODO Auto-generated method stub
		
		String hql = "from Employee where username = ? and password = ?";
		List<Employee> list = this.getHibernateTemplate().find(hql, employee.getUsername(), employee.getPassword());
		if (list.size() > 0) {
			return list.get(0);
		}
		return null;//zhel
	}
	
}
