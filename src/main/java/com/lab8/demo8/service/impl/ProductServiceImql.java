package com.lab8.demo8.service.impl;

import java.util.List;
import java.util.Optional;

import com.lab8.demo8.dao.ProductDAO;
import com.lab8.demo8.entity.Product;
import com.lab8.demo8.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ProductServiceImql implements ProductService {
	@Autowired
	ProductDAO pdao;

	@Override
	public List<Product> findAll() {
		
		return pdao.findAll();
	}

	@Override
	public Product findById(Integer id) {
		
		return pdao.findById(id).get();
	}



	@Override
	public List<Product> findByCategoryId(String cid) {
		// TODO Auto-generated method stub
		return pdao.findByCategoryId(cid);
	}

	@Override
	public Product create(Product product) {
		// TODO Auto-generated method stub
		return pdao.save(product);
	}

	@Override
	public Product update(Product product) {
		// TODO Auto-generated method stub
		return pdao.save(product);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		 pdao.deleteById(id);;
	}
}	
