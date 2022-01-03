package com.socialdemo.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.socialdemo.demo.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {
	

	

}
