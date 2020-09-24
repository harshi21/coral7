package com.verizontraining.microservices.shopping.userservice.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.verizontraining.microservices.shopping.userservice.models.User;

@Repository
public interface UserRepository<UUID> extends JpaRepository<User, UUID>{
	
	 User getUserByEmail(String email) ;
}

	


