package com.lab8.demo8.service.impl;


import java.util.List;
import java.util.stream.Collectors;

import com.lab8.demo8.dao.OrderDAO;
import com.lab8.demo8.dao.OrderDetailDAO;
import com.lab8.demo8.entity.Order;
import com.lab8.demo8.entity.OrderDetail;
import com.lab8.demo8.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;


@Service
public class OrderServiceImql implements OrderService {
	@Autowired
	OrderDAO odao;
	@Autowired
	OrderDetailDAO ddao;
	@Override
	public Order create(JsonNode orderData) {
		ObjectMapper mapper= new ObjectMapper();
		Order order = mapper.convertValue(orderData, Order.class);
		odao.save(order);
		TypeReference<List<OrderDetail>> type =new TypeReference<List<OrderDetail>>() {};
		List<OrderDetail> details=mapper.convertValue(orderData.get("orderDetails"),type )
				.stream().peek(d ->d.setOrder(order)).collect(Collectors.toList());
		ddao.saveAll(details);
		return order;
		
	}
	@Override
	public Order findById(Long id) {
		// TODO Auto-generated method stub
		return odao.findById(id).get();
	}
	@Override
	public List<Order> findByUsername(String username) {
		// TODO Auto-generated method stub
		return odao.findByUsername(username);
	}

}
