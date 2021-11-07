package com.springmongodb.mongodb.service;

import java.util.List;

import com.springmongodb.mongodb.model.Consultas;

public interface ConsultasService {
	
	public List<Consultas> obterTodos();
	
	public Consultas obterPorCod(String cod);
	
	public Consultas criar(Consultas consultas);

	public Consultas atualizar(String id, Consultas consultas);
}
