package com.example.springcache.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springcache.domain.User;
import com.example.springcache.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;	
	@PostMapping("/cache-synch")
	public void addUser(User user) {
		System.out.println("save the user user ");
		 userService.addUser(user);
	}
	
	@GetMapping("/cache-synch")
	public List<User> findUsers() {
		System.out.println("Getting user ");
		return userService.getUsers();
	}
	
	

}
