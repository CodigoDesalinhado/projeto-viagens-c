package com.codigo.desalinhado.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "tb_pacote")
public class Pacote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O título do pacote é obrigatório")
    private String titulo;

    @NotNull(message = "O preço deve ser informado")
    @Min(value = 0, message = "O preço não pode ser negativo")
    private Double preco;

    @NotBlank(message = "A descrição do voo é necessária")
    private String descricaoVoo;

    @ManyToOne
    @JoinColumn(name = "destino_id") // Esta será a FK no banco
    private Destino destino;

    public Pacote() {}

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public Double getPreco() { return preco; }
    public void setPreco(Double preco) { this.preco = preco; }
    public String getDescricaoVoo() { return descricaoVoo; }
    public void setDescricaoVoo(String descricaoVoo) { this.descricaoVoo = descricaoVoo; }
    public Destino getDestino() { return destino; }
    public void setDestino(Destino destino) { this.destino = destino; }
}