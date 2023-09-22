package com.lab8.demo8.rest.controller;

import java.util.List;

import com.lab8.demo8.entity.Role;
import com.lab8.demo8.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@CrossOrigin("*")
@RestController
@RequestMapping("/rest/roles")
public class RoleRestController {
	@Autowired
	RoleService roleService;
	@GetMapping
	public List<Role> getAll(){
		return roleService.findAll();
	}
}
