package com.springmongodb.mongodb.model;

import java.io.Serializable;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document() // registro de um colecao
public class Medicos implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	private String nome;
	private String crm;
	private String especialidade;

	// @DBRef // referencia de collection dentro de outra
	//private Funcionario gestor;

	public Medicos() {
		
	}

	
	public Medicos(String nome, String crm, String especialidade) {
		this.nome = nome;
		this.crm = crm;
		this.especialidade = especialidade;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCrm() {
		return crm;
	}


	public void setCrm(String crm) {
		this.crm = crm;
	}


	public String getEspecialidade() {
		return especialidade;
	}


	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}


	@Override
	public int hashCode() {
		return Objects.hash(crm, especialidade, id, nome);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Medicos other = (Medicos) obj;
		return Objects.equals(crm, other.crm) && Objects.equals(especialidade, other.especialidade)
				&& Objects.equals(id, other.id) && Objects.equals(nome, other.nome);
	}


	

	
	
}
