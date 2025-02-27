package com.edudev.agenda.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edudev.agenda.models.Contato;


@Repository
public interface ContatoRepository  extends JpaRepository<Contato, Long>{
	
	Optional<Contato> findByCelular(String celular);

}
