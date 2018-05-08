package com.newland.ssh.service;

import com.newland.ssh.dao.ProductDao;
import com.newland.ssh.domain.Product;

public class ProductService {
	
	//spring框架中的构造的方式注入bean： productDao
	private ProductDao productDao;
	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}
	
	public void save(Product product){
		System.out.println("ProductService.save()方法被执行....");
		productDao.save(product);
	}
}
