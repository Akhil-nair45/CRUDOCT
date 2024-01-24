package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.Category;

public interface CategoryService {

	
	public Category createCat(Category cat);
	
	public Category findCatById(Integer id);
	
	public List<Category> findAll();
	
	public String deleteCategory(Integer id);
	
	public Category editCat(Category Cat);
}
