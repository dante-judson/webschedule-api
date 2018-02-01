package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

import com.example.demo.model.Person;
import com.example.demo.model.Phone;

@Configuration
public class RestConfiguration extends RepositoryRestConfigurerAdapter{
	
	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		// TODO Auto-generated method stub
		config.exposeIdsFor(Person.class,
							Phone.class);
		
		
	}
	
}
