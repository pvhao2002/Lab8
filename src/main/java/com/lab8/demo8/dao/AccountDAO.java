package com.lab8.demo8.dao;

import java.util.List;

import com.lab8.demo8.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;



public interface AccountDAO extends JpaRepository<Account, String>{
	@Query("SELECT DISTINCT ar.account FROM Authority ar WHERE ar.role.id IN ('DIRE','STAF')")
	List<Account> getAdministrators();

}
