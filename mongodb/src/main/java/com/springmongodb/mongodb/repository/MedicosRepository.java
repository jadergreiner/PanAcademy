package com.springmongodb.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springmongodb.mongodb.model.Medicos;

public interface MedicosRepository extends MongoRepository<Medicos, String> {

}
