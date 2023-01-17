package com.example.demo.services;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entities.User;

import java.util.ArrayList;

@Service
public class UserServiceImpl implements UserService {

	List<User> list;
    public UserServiceImpl () {
    	list = new ArrayList<>();
    	list.add(new User(1,"Snehal", "dhagadi", "dhagdisnehal@gmail.com", "female", "1234567890", "Pune"));
    	list.add(new User(2,"Rutuja", "jadhav", "rutuja@gmail.com", "female", "1234867890", "Pune"));
    	
	}

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return list;
	}
	
	@Override
	public User addUser(User user) {
		list.add(user);
		return user;
		
	}
	

}
