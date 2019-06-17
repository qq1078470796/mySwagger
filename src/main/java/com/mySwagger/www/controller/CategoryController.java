package com.mySwagger.www.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mySwagger.www.entity.Category;
import com.mySwagger.www.service.CategoryService;
import com.mySwagger.www.service.impl.CategoryServiceImpl;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = {"/category/"})
public class CategoryController {
	 @Autowired
	 private CategoryService categoryService;
	 
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	    public ResponseEntity<Category> get(@PathVariable Long id) {
	        Category category = new Category();
	        category=categoryService.findById(id);
	        System.out.println(category.getName());
	        return ResponseEntity.ok(category);
	    }
	
	    @RequestMapping(method = RequestMethod.POST)
	    @ApiOperation(value = "添加一个新的分类")
	    public ResponseEntity<String> add(Category category) {
		     categoryService.add(category);
	        return ResponseEntity.ok("SUCCESS");
	    }

	    @RequestMapping(method = RequestMethod.PUT)
	    @ApiOperation(value = "更新一个分类")
	    
	    public ResponseEntity<String> update(Category category) {
	    	categoryService.update(category);
	        return ResponseEntity.ok("SUCCESS");
	    }

	    @RequestMapping(method = RequestMethod.GET)
	    @ApiOperation(value = "获取所有分类信息", notes = "获取所有分类信息", httpMethod = "GET", response = Category.class, responseContainer = "List")
	    public ResponseEntity<List<Category>> getAllProducts() {
	    	List<Category> list = new ArrayList<>();
	    	list=categoryService.findAll();
	        return ResponseEntity.ok(list);
	    }
}
