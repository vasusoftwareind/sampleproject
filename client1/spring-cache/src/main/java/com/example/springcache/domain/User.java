package com.example.springcache.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "User")
public class User {
	@Id
	private String userName;
	private String role;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public User(String userName, String role) {
		this.userName = userName;
		this.role = role;
	}

	public User() {

	}

}
