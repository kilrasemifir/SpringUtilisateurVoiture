package com.killian.exemple.services;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.killian.exemple.models.Utilisateur;
import com.killian.exemple.repositories.UtilisateurRepository;

@Service
public class UtilisateurService {
	@Autowired
	private UtilisateurRepository repository;
	
	public Collection<Utilisateur> findAll(){
		return this.repository.findAll();
	}
	
	public Optional<Utilisateur> findById(String id){
		return this.repository.findById(id);
	}
	
	public Utilisateur save(Utilisateur utilisateur) {
		return this.repository.save(utilisateur);
	}
	
	public void delete(Utilisateur utilisateur) {
		this.repository.delete(utilisateur);
	}
	
	public boolean exost(String id) {
		return this.repository.existsById(id);
	}
}
