package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.model.Phone;

@RepositoryRestResource(path="phone", collectionResourceRel="phones")
public interface PhoneRepository extends JpaRepository<Phone, Long> {

}
