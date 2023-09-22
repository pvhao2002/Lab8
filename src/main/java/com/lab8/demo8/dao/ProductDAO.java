package com.lab8.demo8.dao;

import java.util.List;
import java.util.Optional;

import com.lab8.demo8.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;



public interface ProductDAO extends JpaRepository<Product, Integer>{
	@Query("SELECT p FROM Product p WHERE p.category.id=?1")
	List<Product> findByCategoryId(String cid);
	
}
