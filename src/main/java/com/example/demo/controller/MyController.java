package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.User;
import com.example.demo.services.UserService;


@RestController

public class MyController {
	
	@Autowired
	private UserService userService;

	@GetMapping("/home")
	public String home() { 
		return"this is home";
	}
	// Get User details
	
	@GetMapping("/user")
	public List<User> getUsers(){ 
		return this.userService.getUsers();
		}

	@PostMapping("/user")
	public User addUser(@RequestBody User user) {
		return this.userService.addUser(user);
	}
	
}
  