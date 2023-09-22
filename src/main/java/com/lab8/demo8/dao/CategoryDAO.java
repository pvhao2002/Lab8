package com.lab8.demo8.dao;

import com.lab8.demo8.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;



public interface CategoryDAO  extends JpaRepository<Category, String>{

}
