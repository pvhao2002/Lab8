package com.lab8.demo8.service.impl;

import java.util.List;

import com.lab8.demo8.dao.CategoryDAO;
import com.lab8.demo8.entity.Category;
import com.lab8.demo8.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class CategoryServiceImql implements CategoryService {
	@Autowired
	CategoryDAO cdao;
	
	@Override
	public List<Category> findAll() {
		// TODO Auto-generated method stub
		return cdao.findAll();
	}

}
