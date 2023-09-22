package com.lab8.demo8.service;

import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;
import com.lab8.demo8.entity.Order;


public interface OrderService {


	Order create(JsonNode orderData);

	Order findById(Long id);

	List<Order> findByUsername(String username);

}
