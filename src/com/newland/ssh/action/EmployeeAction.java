package com.newland.ssh.action;

import com.newland.ssh.domain.Employee;
import com.newland.ssh.service.EmployeeService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/*
 * 员工管理的Action类
 */
public class EmployeeAction extends ActionSupport implements ModelDriven<Employee>{

	//模型驱动使用的对象  
	//使用  模型驱动  接收 struts2 表单提交过来的 数据 
	private Employee employee = new Employee();
	@Override
	public Employee getModel() {
		// TODO Auto-generated method stub
		// 提交过来的 数据 就会被封装到对象当中
		return employee;
	}

	
	//action 类中 需要 注入 service  业务层的类
	private EmployeeService employeeService;
	
	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}



	/**
	 *  struts2 表单 action="employee_login" 登入执行的方法
	 * @return
	 */
	public String login() {
		//使用 employee 对象
		System.out.println("login 方法执行了...");
		
		//调用业务层的类   调用业务层的方法
		Employee existEmployee = employeeService.login(employee);
		if (existEmployee == null) {
			//登入失败
			this.addActionError("用户名或密码错误");
			return INPUT;
		}else {
			//登入成功
			ActionContext.getContext().getSession().put("existEmployee", existEmployee);
			return SUCCESS;
		}
	}
}
