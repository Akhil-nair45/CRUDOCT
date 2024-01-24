package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.User;

public interface UserService {

	public User createUser(User user);
	
	public List<User> getAllUser();
	
	public User getUserbyId(Integer id);
	
	public String deleteUser(Integer id);
	
	public User editUser(User user);
	
	
}
