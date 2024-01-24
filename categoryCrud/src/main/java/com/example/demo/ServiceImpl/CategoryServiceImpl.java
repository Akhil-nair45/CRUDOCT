package com.example.demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Category;
import com.example.demo.Repository.CategoryRepository;
import com.example.demo.Service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService{

	
	@Autowired
	private CategoryRepository cr;
	
	
	@Override
	public Category createCat(Category cat) {
		return cr.save(cat);
	}

	@Override
	public Category findCatById(Integer id) {
		return cr.findById(id).get();
	}

	@Override
	public List<Category> findAll() {
		return cr.findAll();
	}

	@Override
	public String deleteCategory(Integer id) {
		Category category = cr.findById(id).get();
		if(category!=null)
		{
			cr.delete(category);
			return "Category deleted successfully!!!!";
		}
		return "Some error occured!!!!!";
	}

	@Override
	public Category editCat(Category Cat) {
		return cr.save(Cat);
	}

	
}
