package com.codigo.desalinhado.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codigo.desalinhado.entities.Cliente;
import com.codigo.desalinhado.repositories.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repository;
	
	public Cliente salvarViagem(Cliente cliente) {
		return repository.save(cliente);
		
		
	}
	
	public void deletar(Long id) {
		repository.deleteById(id);
	}
	public List <Cliente> listarCliente() {
		return repository.findAll();
	}
	public Cliente buscarPorId(Long id) {
		return repository.findById(id).orElse(null);
	}
	
	public void atualizarViagem(Long Id, Cliente cNovo) {
        Cliente cVelho= repository.findById(Id).get();
        
            cVelho.setNomeCliente(cNovo.getNomeCliente());
            cVelho.setEmail(cNovo.getEmail());
            cVelho.setTelefone(cNovo.getTelefone());
            cVelho.setDocumento(cNovo.getDocumento());

	}
}
