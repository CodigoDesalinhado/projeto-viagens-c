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
	
	public Viagem salvarMusica(Viagem viagem) {
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
	
	public void atualizarMusica(Long Id, Viagem vNovo) {
        Viagem vVelho= repository.findById(Id).get();
        
        	vVelho.setDataViagem(vNovo.getDataViagem());
            vVelho.setDescricao(vNovo.getDescricao());
            vVelho.setLocal(vNovo.getLocal());
            vVelho.setNome(vNovo.getNome());
            vVelho.setPrecoMedio(vNovo.getPrecoMedio());
	}
}
