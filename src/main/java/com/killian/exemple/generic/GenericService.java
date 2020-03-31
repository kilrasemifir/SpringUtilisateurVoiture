package com.killian.exemple.generic;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;

public class GenericService<T, R extends MongoRepository<T, String>> implements IService<T>{


	@Autowired
	private R repository;
	
	public List<T> findAll(){
		return this.repository.findAll();
	}
	
	public T save(T entity) {
		return this.repository.save(entity);
	}

	@Override
	public void delete(T entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<T> findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
