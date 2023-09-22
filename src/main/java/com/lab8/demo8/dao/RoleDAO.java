package com.lab8.demo8.dao;

import com.lab8.demo8.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;



public interface RoleDAO extends JpaRepository<Role, String> {

}
