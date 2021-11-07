package com.springmongodb.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springmongodb.mongodb.model.Consultas;

public interface ConsultasRepository extends MongoRepository<Consultas, String> {
	

}
