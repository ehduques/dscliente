package com.projetodevsuperior.dscliente.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetodevsuperior.dscliente.entities.Category;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {
	
	@GetMapping
	public ResponseEntity<List<Category>>findAll() {
		List<Category> list = new ArrayList<>();
		list.add(new Category(1L, "Name"));
		list.add(new Category(2L, "CPF"));
		return ResponseEntity.ok().body(list);
		
	}
}
