package com.springmongodb.mongodb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmongodb.mongodb.model.Medicos;
import com.springmongodb.mongodb.repository.MedicosRepository;


@Service
public class MedicosServiceImpl implements MedicosService {

	@Autowired
	MedicosRepository medicosRepository;
	
	@Override
	public List<Medicos> obterTodos() {
		return this.medicosRepository.findAll();
	}

	@Override
	public Medicos obterPorCod(String cod) {
		return this.medicosRepository
				.findById(cod)
				.orElseThrow(() -> new IllegalArgumentException("Médicos inexistente!"));
	}
	


	@Override
	public Medicos criar(Medicos medicos) {
		
		return this.medicosRepository.save(medicos);
	}

	@Override
	public Medicos obterPorNome(String nome) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
