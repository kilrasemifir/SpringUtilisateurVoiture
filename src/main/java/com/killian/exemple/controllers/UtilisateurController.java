package com.killian.exemple.controllers;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.killian.exemple.models.Utilisateur;
import com.killian.exemple.services.UtilisateurService;

@RestController
@RequestMapping("utilisateurs")
public class UtilisateurController {

	@Autowired
	private UtilisateurService service;
	
	@GetMapping("")
	private Collection<Utilisateur> findAll(){
		return this.service.findAll();
	}
	
	@PostMapping("")
	private Utilisateur save(@RequestBody Utilisateur utilisateur) {
		System.out.println(utilisateur.getNom());
		return this.service.save(utilisateur);		
	}
	
	@PutMapping("")
	private Utilisateur update(@RequestBody Utilisateur utilisateur) {
		return this.service.save(utilisateur);
	}
	
	@DeleteMapping("")
	private void delete(@RequestBody Utilisateur utilisateur) {
		this.service.delete(utilisateur);
	}
	
	@GetMapping("/{id}")
	private Optional<Utilisateur> findById(@PathVariable String id){
		return this.service.findById(id);
	}
}
