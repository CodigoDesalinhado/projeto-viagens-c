package com.codigo.desalinhado.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.codigo.desalinhado.entities.Viagem;

public interface ViagemRepository extends JpaRepository<Viagem, Long> {
}