package com.lab8.demo8.service.impl;

import java.util.List;

import com.lab8.demo8.dao.RoleDAO;
import com.lab8.demo8.entity.Role;
import com.lab8.demo8.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class RoleServiceImql implements RoleService {
	@Autowired
	RoleDAO rdao;
	@Override
	public List<Role> findAll() {
		// TODO Auto-generated method stub
		return rdao.findAll();
	}

}
