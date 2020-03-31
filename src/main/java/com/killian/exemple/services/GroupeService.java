package com.killian.exemple.services;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.killian.exemple.models.Groupe;
import com.killian.exemple.models.Utilisateur;
import com.killian.exemple.repositories.GroupeRepository;

@Service
public class GroupeService {

	@Autowired
	private GroupeRepository repository;
	
	public List<Groupe> findAll(){
		return this.repository.findAll();
	}
	
	public Optional<Groupe> findById(String id){
		return this.repository.findById(id);
	}
	
	public Groupe save(Groupe entity) {
		return this.repository.save(entity);
	}
	
	public void delete(Groupe entity) {
		this.repository.delete(entity);
	}
}
