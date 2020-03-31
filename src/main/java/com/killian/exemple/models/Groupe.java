package com.killian.exemple.models;

import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document("groupe")
public class Groupe {

	@Id
	private String id;
	private String nom;
	@DBRef
	private Set<Utilisateur> utilisateurs;
	
}
