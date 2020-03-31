package com.killian.exemple.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.killian.exemple.generic.GenericService;
import com.killian.exemple.generic.IService;
import com.killian.exemple.models.Groupe;
import com.killian.exemple.repositories.GroupeRepository;
import com.killian.exemple.services.GroupeService;

@Configuration
public class GenericServiceConfiguration {

	@Bean
	public IService<Groupe> groupeGService(){
		return new GenericService<Groupe,GroupeRepository>();
	}
}
