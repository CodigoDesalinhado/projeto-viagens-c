package com.codigo.desalinhado.repositories;

import com.codigo.desalinhado.entities.Pacote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacoteRepository extends JpaRepository<Pacote, Long> {
	
}