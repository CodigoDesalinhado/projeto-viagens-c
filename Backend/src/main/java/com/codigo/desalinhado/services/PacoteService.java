package com.codigo.desalinhado.services;

import com.codigo.desalinhado.entities.Pacote;
import com.codigo.desalinhado.repositories.PacoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PacoteService {

    @Autowired
    private PacoteRepository repository;

    public List<Pacote> listarTodos() {
        return repository.findAll();
    }

    public Pacote buscarPorId(Long id) {
        Optional<Pacote> obj = repository.findById(id);
        return obj.orElseThrow(() -> new RuntimeException("Pacote não encontrado com ID: " + id));
    }

    public Pacote salvar(Pacote pacote) {
        return repository.save(pacote);
    }

    public Pacote atualizar(Long id, Pacote novoPacote) {
        Pacote entidade = buscarPorId(id); // Garante que existe ou lança 404/Erro
        entidade.setTitulo(novoPacote.getTitulo());
        entidade.setPreco(novoPacote.getPreco());
        entidade.setDescricaoVoo(novoPacote.getDescricaoVoo());
        entidade.setDestino(novoPacote.getDestino());
        return repository.save(entidade);
    }

    public void deletar(Long id) {
        Pacote entidade = buscarPorId(id);
        repository.delete(entidade);
    }
}