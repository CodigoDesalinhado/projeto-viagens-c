package com.codigo.desalinhado.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "tb_viagens")
public class Viagem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "Nome do país", nullable = true, unique = true)
	private String nome;
	
	
	private String local;
	
	private String descricao;
	
	@NotBlank(message = "O preço deve ser inserido.")
	private double precoMedio;
	
	@Max(2025)
	private Integer dataViagem;

	
	public Viagem() {}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getLocal() {
		return local;
	}


	public void setLocal(String local) {
		this.local = local;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public double getPrecoMedio() {
		return precoMedio;
	}


	public void setPrecoMedio(double precoMedio) {
		this.precoMedio = precoMedio;
	}


	public Integer getDataViagem() {
		return dataViagem;
	}


	public void setDataViagem(Integer dataViagem) {
		this.dataViagem = dataViagem;
	}
	
}


