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

import com.codigo.desalinhado.entities.Viagem;
import com.codigo.desalinhado.services.ViagemService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/viagem")
public class ViagemController {
	
	@Autowired
	private ViagemService service;

	@PostMapping
	public Viagem cadastrar(@Valid @RequestBody Viagem viagem) {
		return service.salvarMusica(viagem);
		
	}
	
	@GetMapping
	public List<Viagem>listarTodos() {
		return service.listarViagem();
	}
	
	@GetMapping("/{id}")
	public Viagem buscarPorId(@PathVariable Long id) {
		return service.buscarPorId(id);
	}
	
	@DeleteMapping ("/{id}")
	public void deletar (@PathVariable Long id) {
		service.deletar(id);
	}

}

