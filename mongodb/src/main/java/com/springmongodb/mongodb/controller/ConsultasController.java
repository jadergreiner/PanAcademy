package com.springmongodb.mongodb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springmongodb.mongodb.model.Consultas;
import com.springmongodb.mongodb.service.ConsultasService;

@RestController
@RequestMapping(path = "/consultas")
public class ConsultasController {
	
	@Autowired
	private ConsultasService consultasService;

	@GetMapping
	public List<Consultas> obterTodos() {
		return this.consultasService.obterTodos();
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Consultas> obterPorCodigo(@PathVariable String id) {
		Consultas obj = this.consultasService.obterPorCod(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@PutMapping(value="/{id}")
	public ResponseEntity<Consultas> atualizar(@PathVariable String id, @RequestBody Consultas consultas){
		Consultas obj = this.consultasService.atualizar(id, consultas);
		return ResponseEntity.ok().body(obj);
	}
			
	
	@PostMapping
	public Consultas criar(@RequestBody Consultas consultas) {
		return this.consultasService.criar(consultas);
	}
	
}
