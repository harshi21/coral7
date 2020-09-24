package com.verizontraining.microservices.shopping.userservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.verizontraining.microservices.shopping.userservice.models.User;
import com.verizontraining.microservices.shopping.userservice.services.UserService;
import com.verizontraining.microservices.shopping.userservice.userPOJOs.RegistrationRequest;

@RestController
public class AuthController {
	
	@Autowired UserService userService;
	
	@PostMapping("/registration")
//	public ResponseEntity<Object> registration(){
	public User registration(@RequestBody RegistrationRequest rRequest){	
		User user =new User();
		user.setName(rRequest.getName());
		user.setPassword(rRequest.getPassword());
		user.setEmail(rRequest.getEmail());
		user.setActive(true);
		User savedUser =this.userService.saveUser(user);
		return savedUser;
	}

}
