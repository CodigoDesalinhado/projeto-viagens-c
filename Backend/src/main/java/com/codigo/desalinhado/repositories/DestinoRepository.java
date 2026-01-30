package com.codigo.desalinhado.repositories;

import com.codigo.desalinhado.entities.Destino;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DestinoRepository extends JpaRepository<Destino, Long> {
	
}