package com.lab8.demo8.dao;

import java.util.List;

import com.lab8.demo8.entity.Account;
import com.lab8.demo8.entity.Authority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;



public interface AuthorityDAO extends JpaRepository<Authority, Integer> {
	@Query("SELECT DISTINCT a FROM Authority a WHERE a.account IN ?1")
	List<Authority> authritiesOf(List<Account> accounts);


}
