package com.codigo.desalinhado.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.codigo.desalinhado.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}