package com.killian.exemple.generic;

import java.util.List;
import java.util.Optional;

public interface IService<T> {

	public List<T> findAll();
	public T save(T entity);
	public void delete(T entity);
	public Optional<T> findById(String id);
}
