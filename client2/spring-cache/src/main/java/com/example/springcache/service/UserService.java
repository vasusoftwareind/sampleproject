package com.example.springcache.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springcache.domain.User;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public List<User> getUsers() {
		return userRepository.findAll();
	}
	public void addUser(User user) {
		userRepository.save(user);
		
	}
}
