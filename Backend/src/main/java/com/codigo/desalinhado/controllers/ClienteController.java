package com.codigo.desalinhado.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codigo.desalinhado.entities.Cliente;
import com.codigo.desalinhado.services.ClienteService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/viagem")
public class ClienteController {
	
	@Autowired
	private ClienteService service;

	@PostMapping
	public Cliente cadastrar(@Valid @RequestBody Cliente cliente) {
		return service.salvarViagem(cliente);
		
	}
	
	@GetMapping
	public List<Cliente>listarTodos() {
		return service.listarCliente();
	}
	
	@GetMapping("/{id}")
	public Cliente buscarPorId(@PathVariable Long id) {
		return service.buscarPorId(id);
	}
	
	@DeleteMapping ("/{id}")
	public void deletar (@PathVariable Long id) {
		service.deletar(id);
	}

}

