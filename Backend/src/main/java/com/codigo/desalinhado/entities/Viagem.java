package com.codigo.desalinhado.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "tb_destinos")
public class Viagem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "nome_destino", nullable = true, unique = true)
	private String nome;
	
	@Column(name = "descricao")
	private String descricao;
	
	@NotBlank(message = "O preço deve ser inserido.")
	@Column(name = "preco_medio", nullable = true)
	private double precoMedio;
	
	@ManyToOne
	private Cliente clientes;

	
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


}

