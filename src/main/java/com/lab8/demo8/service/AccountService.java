package com.lab8.demo8.service;

import com.lab8.demo8.entity.Account;

import java.util.List;



public interface AccountService {
	public Account findById(String username);

	public List<Account> getAdministrators();

	public List<Account> findAll();
}
