package com.algaworks.crm.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.crm.modal.Categorie;
import com.algaworks.crm.repository.CategoriesRepository;

@RestController
@RequestMapping("/categorie")
public class CategorieController {
	
	@Autowired
	CategoriesRepository repository; 
	
	@GetMapping
	public List<Categorie> getAllCategories(){
		return repository.findAll(); 
	}
	
	@GetMapping("/{code}")
	public Categorie getCategorieById(@PathVariable Long code) {
		 Optional<Categorie> categorie = repository.findById(code);
		 return categorie.get(); 
	}
	
	@PostMapping
	public Categorie saveCategorie(@RequestBody Categorie categorie) {
		return repository.save(categorie); 
	}
	
	@DeleteMapping("/{code}")
	public void deleteCategorie(@PathVariable Long code) {
		repository.deleteById(code); 
	}
	
}
