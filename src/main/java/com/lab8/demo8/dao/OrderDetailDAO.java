package com.lab8.demo8.dao;

import com.lab8.demo8.entity.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;



public interface OrderDetailDAO extends JpaRepository<OrderDetail, Long>{

}
