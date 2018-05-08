package com.newland.ssh.action;

import org.apache.log4j.xml.DOMConfigurator;

import org.apache.log4j.Logger;


import com.newland.ssh.domain.Product;
import com.newland.ssh.service.ProductService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * 商品管理的Action类
 */
public class ProductAction extends ActionSupport implements ModelDriven<Product>{
	
	//product对象的属性通过ModelDriven从http请求中获取到
	private Product product = new Product();
	@Override
	public Product getModel() {
		// TODO Auto-generated method stub
		return product;
	}
	
	private static final long serialVersionUID = 1L;
	
	//此需要导入struts2-spring-plugin-2.3.20.jar包
    //则struts和spring整合实现了按名称自动注入service
	private ProductService productService;
	
	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	
	//执行保存商品的方法
	public String save() {
		
//		String name = this.product.getPname();
//		Double price = this.product.getPrice();
//		System.out.println("name:"+ name+" price:"+ price);
		System.out.println("ProductAction.save()方法被执行....");
		productService.save(product);
		
		
/*		DOMConfigurator.configure("E:/log4j.xml");//加载.xml文件
		//PropertyConfigurator.configure("E:/study/log4j/log4j.properties");//加载.properties文件
		Logger log=Logger.getLogger("org.zblog.test");
		log.info("测试"); */
		
		
		
		return null;
	}
}
