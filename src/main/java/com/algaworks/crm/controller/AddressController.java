package com.algaworks.crm.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.crm.modal.Address;
import com.algaworks.crm.repository.AddressRepository;

@RequestMapping
@RestController("/address")
public class AddressController {

	@Autowired
	private AddressRepository repository; 
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<?> getAllAddress() {
		return ResponseEntity.ok(repository.findAll()); 
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getByIdAddress(@PathVariable Long id) {
		Optional<Address> addressFilter = repository.findById(id); 
		return addressFilter.isEmpty() ? ResponseEntity.ok(addressFilter) : ResponseEntity.notFound().build();
	}
}
