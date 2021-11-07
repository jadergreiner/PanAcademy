package com.springmongodb.mongodb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springmongodb.mongodb.model.Medicos;
import com.springmongodb.mongodb.service.MedicosService;

@RestController
@RequestMapping(path = "/medicos")
public class MedicosController {
	
	@Autowired
	private MedicosService medicosService;

	@GetMapping
	public List<Medicos> obterTodos() {
		return this.medicosService.obterTodos();
}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Medicos> obterPorCodigo(@PathVariable String id) {
		Medicos obj = this.medicosService.obterPorCod(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@PostMapping
	public Medicos criar(@RequestBody Medicos medicos) {
		return this.medicosService.criar(medicos);
	}
	
}
