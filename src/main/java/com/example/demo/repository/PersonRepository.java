package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.model.Person;

@RepositoryRestResource(path="/person", collectionResourceRel="persons")
public interface PersonRepository extends JpaRepository<Person, Long>{
	
}
