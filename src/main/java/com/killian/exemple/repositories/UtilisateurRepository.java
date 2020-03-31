package com.killian.exemple.repositories;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.killian.exemple.models.Utilisateur;

public interface UtilisateurRepository extends MongoRepository<Utilisateur, String> {
	public Optional<Utilisateur> findByNomAndPrenom(String nom);
	

}
