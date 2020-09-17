package com.mohammad.springboot.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.mohammad.springboot.model.User;
import com.mohammad.springboot.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{

	public User save(UserRegistrationDto registrationDto);
	
}
