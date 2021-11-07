package com.springmongodb.mongodb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmongodb.mongodb.model.Consultas;
import com.springmongodb.mongodb.model.Medicos;
import com.springmongodb.mongodb.repository.ConsultasRepository;
import com.springmongodb.mongodb.repository.MedicosRepository;


@Service
public class ConsultasServiceImpl implements ConsultasService {

	@Autowired
	ConsultasRepository consultasRepository;
	
	@Autowired
	MedicosRepository medicosRepository;
	
	
	
	@Override
	public List<Consultas> obterTodos() {
		return this.consultasRepository.findAll();
	}

	@Override
	public Consultas obterPorCod(String cod) {
		return this.consultasRepository
				.findById(cod)
				.orElseThrow(() -> new IllegalArgumentException("Consulta inexistente!"));
	}

	@Override
	public Consultas criar(Consultas consultas) {
			
		Medicos medicos = 
			this.medicosRepository		
				.findById(consultas.getMedicos().getId())
				.orElseThrow(() -> new IllegalArgumentException("Medico inexistente"));
		consultas.setMedicos(medicos); 
		
		return this.consultasRepository.save(consultas);
	}

	@Override
	public Consultas atualizar(String id, Consultas consultaAtualizada) {
		Consultas consultas = obterPorCod(id);
		
		consultas.setNomePaciente(consultaAtualizada.getNomePaciente());
		consultas.setDataConsulta(consultaAtualizada.getDataConsulta());
		consultas.setEspecialidade(consultaAtualizada.getEspecialidade());
		Medicos medicos = this.medicosRepository
												.findById(consultaAtualizada.getMedicos().getId())
												.orElseThrow(() -> new IllegalArgumentException("Medico inexistente"));
		consultas.setMedicos(medicos);
		
		return this.consultasRepository.save(consultas);
		
	}
	
	
}
