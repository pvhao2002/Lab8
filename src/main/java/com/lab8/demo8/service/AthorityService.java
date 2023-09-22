package com.lab8.demo8.service;

import com.lab8.demo8.entity.Authority;

import java.util.List;



public interface AthorityService {

	public List<Authority> findAuthoritiesOfAdministrators();

	public List<Authority> findAll();
	
	public void delete(Integer id);

	public Authority create(Authority auth);

}
