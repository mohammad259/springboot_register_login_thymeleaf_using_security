package com.mohammad.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mohammad.springboot.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	public User findByEmail(String email);
}
