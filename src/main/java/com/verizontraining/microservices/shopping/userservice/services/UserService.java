package com.verizontraining.microservices.shopping.userservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.verizontraining.microservices.shopping.userservice.models.User;
import com.verizontraining.microservices.shopping.userservice.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public User saveUser(User user) {
		 return (User) userRepository.save(user);
		
	}
	private User getUserByEmail(String email) {
		return (User) userRepository.getUserByEmail(email);
	
	}

}
