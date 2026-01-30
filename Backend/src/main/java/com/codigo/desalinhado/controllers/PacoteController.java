package com.codigo.desalinhado.controllers;

import com.codigo.desalinhado.entities.Pacote;
import com.codigo.desalinhado.services.PacoteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pacotes")
@CrossOrigin(origins = "*")
public class PacoteController {

    @Autowired
    private PacoteService service;

    @GetMapping
    public List<Pacote> listar() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pacote> buscar(@PathVariable Long id) {
        return ResponseEntity.ok(service.buscarPorId(id));
    }

    @PostMapping
    public Pacote criar(@Valid @RequestBody Pacote pacote) {
        return service.salvar(pacote);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Pacote> atualizar(@PathVariable Long id, @Valid @RequestBody Pacote pacote) {
        return ResponseEntity.ok(service.atualizar(id, pacote));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }
}