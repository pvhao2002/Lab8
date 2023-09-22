package com.lab8.demo8.service.impl;

import java.util.List;

import com.lab8.demo8.dao.AccountDAO;
import com.lab8.demo8.entity.Account;
import com.lab8.demo8.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AccountServiceImql implements AccountService {
	@Autowired
	AccountDAO adao;

	@Override
	public Account findById(String username) {
		// TODO Auto-generated method stub
		return adao.findById(username).get();
	}

	@Override
	public List<Account> getAdministrators() {
		// TODO Auto-generated method stub
		return adao.getAdministrators();
	}

	@Override
	public List<Account> findAll() {
		// TODO Auto-generated method stub
		return adao.findAll();
	}
	
}
