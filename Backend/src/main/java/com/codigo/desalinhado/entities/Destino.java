package com.codigo.desalinhado.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_destino")
public class Destino {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O nome da maravilha não pode ser vazio")
    private String nome;

    @NotBlank(message = "A localização é obrigatória")
    private String localizacao;

    // Relacionamento: Um destino pode ter vários pacotes de viagem
    @OneToMany(mappedBy = "destino", cascade = CascadeType.ALL)
    private List<Pacote> pacotes = new ArrayList<>();

    public Destino() {}

    public Destino(Long id, String nome, String localizacao) {
        this.id = id;
        this.nome = nome;
        this.localizacao = localizacao;
    }

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getLocalizacao() { return localizacao; }
    public void setLocalizacao(String localizacao) { this.localizacao = localizacao; }
    public List<Pacote> getPacotes() { return pacotes; }
}