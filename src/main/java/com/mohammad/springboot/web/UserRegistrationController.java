package com.mohammad.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mohammad.springboot.service.UserService;
import com.mohammad.springboot.web.dto.UserRegistrationDto;

@Controller
@RequestMapping("/register")
public class UserRegistrationController {

	private UserService service;
	
	public UserRegistrationController(UserService service) {
		this.service =service;
	}
	
	@ModelAttribute("user")
	public UserRegistrationDto registrationDto() {
		return new UserRegistrationDto();
	}
	
	@GetMapping
	public String showRegister() {
		return "register";
	}
	@PostMapping
	public String register(@ModelAttribute("user") UserRegistrationDto registrationDto ) {
		
		service.save(registrationDto);
		return "redirect:/register?success";
		
	}
	
}
