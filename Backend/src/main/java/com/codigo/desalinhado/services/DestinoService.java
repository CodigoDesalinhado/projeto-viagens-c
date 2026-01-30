package com.codigo.desalinhado.services;

import com.codigo.desalinhado.entities.Destino;
import com.codigo.desalinhado.repositories.DestinoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class DestinoService {

    @Autowired
    private DestinoRepository repository;

    public List<Destino> listarTodos() {
        return repository.findAll();
    }

    public Destino buscarPorId(Long id) {
        Optional<Destino> obj = repository.findById(id);
        // Tratamento simples para NotFound
        return obj.orElseThrow(() -> new RuntimeException("Destino (Maravilha) não encontrado com ID: " + id));
    }

    public Destino salvar(Destino destino) {
        return repository.save(destino);
    }

    public Destino atualizar(Long id, Destino novoDestino) {
        Destino entidade = buscarPorId(id);
        entidade.setNome(novoDestino.getNome());
        entidade.setLocalizacao(novoDestino.getLocalizacao());
        return repository.save(entidade);
    }

    public void deletar(Long id) {
        Destino entidade = buscarPorId(id);
        repository.delete(entidade);
    }
}