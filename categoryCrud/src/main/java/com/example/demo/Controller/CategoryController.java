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

import com.example.demo.Entity.Category;
import com.example.demo.Service.CategoryService;

@RestController
@RequestMapping("/Category")
public class CategoryController {

	
	@Autowired
	private CategoryService cs;
	
	
	@PostMapping("/create")
	public ResponseEntity<?> saveCategory(@RequestBody Category cat)
	{
		return new ResponseEntity<>(cs.createCat(cat),HttpStatus.CREATED);
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity<?> findById(@PathVariable Integer id)
	{
		return new ResponseEntity<>(cs.findCatById(id),HttpStatus.OK);
	}
	
	@GetMapping("/findAll")
	public ResponseEntity<?> findAll()
	{
		return new ResponseEntity<>(cs.findAll(),HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteCat(@PathVariable Integer id)
	{
		return new ResponseEntity<>(cs.deleteCategory(id),HttpStatus.CREATED);
	}
	
	@PutMapping("/edit")
	public ResponseEntity<?> findById(@RequestBody Category cat)
	{
		return new ResponseEntity<>(cs.editCat(cat),HttpStatus.CREATED);
	}
}
