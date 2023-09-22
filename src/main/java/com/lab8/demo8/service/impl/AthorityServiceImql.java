package com.lab8.demo8.service.impl;

import java.util.List;

import com.lab8.demo8.dao.AccountDAO;
import com.lab8.demo8.dao.AuthorityDAO;
import com.lab8.demo8.entity.Account;
import com.lab8.demo8.entity.Authority;
import com.lab8.demo8.service.AthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AthorityServiceImql  implements AthorityService {
	@Autowired
	AuthorityDAO adao;
	@Autowired
	AccountDAO acdao;

	@Override
	public List<Authority> findAuthoritiesOfAdministrators() {
		// TODO Auto-generated method stub
		List<Account> accounts =acdao.getAdministrators();
		return adao.authritiesOf(accounts);
	}

	@Override
	public List<Authority> findAll() {
		// TODO Auto-generated method stub
		return adao.findAll();
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		adao.deleteById(id);
	}

	@Override
	public Authority create(Authority auth) {
		// TODO Auto-generated method stub
		return adao.save(auth);
	}
	
}
