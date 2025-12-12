package com.codigo.desalinhado.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codigo.desalinhado.entities.Viagem;
import com.codigo.desalinhado.repositories.ViagemRepository;

@Service
public class ViagemService {
	
	@Autowired
	private ViagemRepository repository;
	
	public Viagem salvarViagem(Viagem viagem) {
		return repository.save(viagem);
		
		
	}
	
	public void deletar(Long id) {
		repository.deleteById(id);
	}
	public List <Viagem> listarViagem() {
		return repository.findAll();
	}
	public Viagem buscarPorId(Long id) {
		return repository.findById(id).orElse(null);
	}
	
	public void atualizarViagem(Long Id, Viagem vNovo) {
        Viagem vVelho= repository.findById(Id).get();
        
            vVelho.setDescricao(vNovo.getDescricao());
            vVelho.setNome(vNovo.getNome());
            vVelho.setPrecoMedio(vNovo.getPrecoMedio());
	}
}
