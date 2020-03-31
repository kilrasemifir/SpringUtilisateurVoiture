package com.killian.exemple.controllers;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.killian.exemple.generic.GenericService;
import com.killian.exemple.generic.IService;
import com.killian.exemple.models.Groupe;
import com.killian.exemple.repositories.GroupeRepository;
import com.killian.exemple.services.GroupeService;

@RestController
@RequestMapping("groupes")
public class GroupeController {

	@Autowired
	@Qualifier("groupeGService")
	private GroupeService service;
	
	@GetMapping("")
	private Collection<Groupe> findAll(){
		return this.service.findAll();
	}
	
	@PostMapping("")
	private Groupe save(@RequestBody Groupe entity) {
		return this.service.save(entity);		
	}
	
	@PutMapping("")
	private Groupe update(@RequestBody Groupe entity) {
		return this.service.save(entity);
	}
	
	@DeleteMapping("")
	private void delete(@RequestBody Groupe Groupe) {
		this.service.delete(Groupe);
	}
	
	@GetMapping("/{id}")
	private Optional<Groupe> findById(@PathVariable String id){
		return this.service.findById(id);
	}
}
