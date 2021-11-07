package com.springmongodb.mongodb.service;

import java.util.List;

import com.springmongodb.mongodb.model.Medicos;

public interface MedicosService {
	
	public List<Medicos> obterTodos();
	
	public Medicos obterPorCod(String cod);
	
	public Medicos criar(Medicos medicos);

	public Medicos obterPorNome(String nome);
}
