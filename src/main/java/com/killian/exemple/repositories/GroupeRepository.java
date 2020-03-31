package com.killian.exemple.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.killian.exemple.models.Groupe;

public interface GroupeRepository extends MongoRepository<Groupe, String> {

}
