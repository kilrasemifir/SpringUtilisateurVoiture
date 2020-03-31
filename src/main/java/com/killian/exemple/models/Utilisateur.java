package com.killian.exemple.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Document("utilisateur")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Utilisateur {

	@Id
	private String id;
	private String nom;
	private String prenom;
}
