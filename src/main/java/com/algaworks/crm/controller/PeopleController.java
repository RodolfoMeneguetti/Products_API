package com.algaworks.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.crm.modal.People;
import com.algaworks.crm.repository.PeopleRepository;

@RestController
@RequestMapping("/people")
public class PeopleController {

	@Autowired
	private PeopleRepository repository; 
	
	@GetMapping
	public List<People> getAllPeople(){
		return repository.findAll(); 
	}
	
	@PostMapping
	public People savePeople(@RequestBody People people) {
		return repository.save(people); 
	}
		
	@GetMapping("/{id}")
	public People getByIdPeople(@PathVariable Long id) {
		return repository.findById(id).get(); 
	}
	
	@DeleteMapping("/{id}")
	public void deleteCategorie(@PathVariable Long id) {
		repository.deleteById(id);
	}
}
