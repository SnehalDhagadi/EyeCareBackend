package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.User;

public interface UserService {
	public List<User> getUsers();
	public User addUser(User user);

}
