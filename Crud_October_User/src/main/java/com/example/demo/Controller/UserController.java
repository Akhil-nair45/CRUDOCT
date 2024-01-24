package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.User;
import com.example.demo.Service.UserService;

@RestController
@RequestMapping("/User")
public class UserController {

	
	@Autowired
	private UserService us;
	
	
	@PostMapping("/addUser")
	public ResponseEntity<?> addUser(@RequestBody User user)
	{
		return new ResponseEntity<>(us.createUser(user),HttpStatus.CREATED);
	}
	
	@GetMapping("/findAll")
	public ResponseEntity<?> findAllUser()
	{
		return new ResponseEntity<>(us.getAllUser(),HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> findUserById(@PathVariable Integer id)
	{
		return new ResponseEntity<>(us.getUserbyId(id),HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deldeteUser(@PathVariable Integer id)
	{
		return new ResponseEntity<>(us.deleteUser(id),HttpStatus.OK);
	}
	
	@PutMapping("/edit")
	public ResponseEntity<?> editUser(@RequestBody User user)
	{
		return new ResponseEntity<>(us.editUser(user),HttpStatus.CREATED);
	}
}
