package com.lab8.demo8.dao;

import java.util.List;

import com.lab8.demo8.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;



public interface OrderDAO extends JpaRepository<Order, Long>{
	
	
	@Query("SELECT o FROM Order o WHERE o.account.username=?1")
	List<Order> findByUsername(String username);

}
