package com.edudev.agenda.models;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class Contato {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length = 100, nullable = false)
	private String nome;
	
	@Column(length = 255, nullable = false)
	private String email;
	
	@Column(length = 11, nullable = false)
	private String celular;
	
	@Column(length = 10)
	private String telefone;
	
	@Column(nullable = false)
	private Boolean favorito = false;
	
	@Column(nullable = false)
	private Boolean ativo = true;
	
	@Column(nullable = false, updatable = false)
	private LocalDateTime dataHoraCadastro;
}
