package com.springmongodb.mongodb.model;

import java.io.Serializable;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;


@Document() // registro de um colecao
public class Consultas implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	private String nomePaciente;
	private String dataConsulta;
	private String especialidade;

	 @DBRef(lazy = false) // referencia de collection dentro de outra
	private Medicos medicos;

	
	public Consultas(Medicos medicos, String id, String nomePaciente, String especialidade, String dataConsulta) {
		this.id = id;
		this.nomePaciente = nomePaciente;
		this.dataConsulta = dataConsulta;
		this.especialidade = especialidade;
		this.medicos = medicos;
	}
	
	public Consultas () {
		
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getNomePaciente() {
		return nomePaciente;
	}


	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}


	public String getDataConsulta() {
		return dataConsulta;
	}


	public void setDataConsulta(String dataConsulta) {
		this.dataConsulta = dataConsulta;
	}


	public String getEspecialidade() {
		return especialidade;
	}


	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}


	public Medicos getMedicos() {
		return medicos;
	}


	public void setMedicos(Medicos medicos) {
		this.medicos = medicos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dataConsulta, especialidade, id, medicos, nomePaciente);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Consultas other = (Consultas) obj;
		return Objects.equals(dataConsulta, other.dataConsulta) && Objects.equals(especialidade, other.especialidade)
				&& Objects.equals(id, other.id) && Objects.equals(medicos, other.medicos)
				&& Objects.equals(nomePaciente, other.nomePaciente);
	}
	
	


}
