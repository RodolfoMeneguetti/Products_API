package com.algaworks.crm.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.algaworks.crm.modal.Categorie;
import com.algaworks.crm.repository.CategorieRepository;

@RestController
@RequestMapping("/categorie")
@CrossOrigin(origins = "*", maxAge = 3600)
public class CategorieController {
	
	@Autowired
	private CategorieRepository  categorieRepository;
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<?> getAllCategories(){
		return ResponseEntity.ok(categorieRepository.findAll());
	}
	
	@GetMapping("/{code}")
	public Categorie getCategorieByIdCategorie(@PathVariable Long code) {
		 Optional<Categorie> categorie = categorieRepository.findById(code);
		 return categorie.get();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Categorie saveCategorie(@RequestBody Categorie categorie) {
		return categorieRepository.save(categorie);
	}
	
	@DeleteMapping("/{code}")
	public void deleteCategorie(@PathVariable Long code) {
		categorieRepository.deleteById(code);
	}
	
}
