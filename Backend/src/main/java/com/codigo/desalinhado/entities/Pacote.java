package com.codigo.desalinhado.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Pacote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O nome do pacote não pode estar vazio")
    private String nome;

    @NotNull(message = "O preço é obrigatório")
    @Positive(message = "O preço deve ser maior que zero")
    private BigDecimal preco;

    @Future(message = "A data da viagem deve ser no futuro")
    @NotNull
    private LocalDate dataViagem;

    @ManyToOne
    @JoinColumn(name = "destino_id", nullable = false)
    @NotNull(message = "Selecione uma das 7 Maravilhas")
    private Destino destino;

    // Construtores
    public Pacote() {}

    public Pacote(String nome, BigDecimal preco, LocalDate dataViagem, Destino destino) {
        this.nome = nome;
        this.preco = preco;
        this.dataViagem = dataViagem;
        this.destino = destino;
    }

    // Getters e Setters Manuais
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public BigDecimal getPreco() { return preco; }
    public void setPreco(BigDecimal preco) { this.preco = preco; }
    public LocalDate getDataViagem() { return dataViagem; }
    public void setDataViagem(LocalDate dataViagem) { this.dataViagem = dataViagem; }
    public Destino getDestino() { return destino; }
    public void setDestino(Destino destino) { this.destino = destino; }
}