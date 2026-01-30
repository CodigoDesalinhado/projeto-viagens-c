package com.codigo.desalinhado.controllers;

import com.codigo.desalinhado.entities.Destino;
import com.codigo.desalinhado.services.DestinoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/destinos")
@CrossOrigin(origins = "*") // Permite que o seu frontend acesse a API
public class DestinoController {

    @Autowired
    private DestinoService service;

    @GetMapping
    public List<Destino> listar() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Destino> buscar(@PathVariable Long id) {
        return ResponseEntity.ok(service.buscarPorId(id));
    }

    @PostMapping
    public Destino criar(@Valid @RequestBody Destino destino) {
        return service.salvar(destino);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Destino> atualizar(@PathVariable Long id, @Valid @RequestBody Destino destino) {
        return ResponseEntity.ok(service.atualizar(id, destino));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }
}