package com.example.demo.ServiecImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.User;
import com.example.demo.Repository.UserRepo;
import com.example.demo.Service.UserService;

@Service
public class UserServiceImpl implements UserService {

	
	@Autowired
	private UserRepo ur;

	@Override
	public User createUser(User user) {
		return ur.save(user);
	}

	@Override
	public List<User> getAllUser() {
		return ur.findAll();
	}

	@Override
	public User getUserbyId(Integer id) {
		return ur.findById(id).get();
	}

	@Override
	public String deleteUser(Integer id) {
		User user1= ur.findById(id).get();
		if(user1!=null)
		{
			ur.delete(user1);
			return "User deleted Successfully!!!!!";
		}
		return "Some error Occured!!!!!" ;
	}

	@Override
	public User editUser(User user) {
		return ur.save(user);
	}
	
	
	
}
