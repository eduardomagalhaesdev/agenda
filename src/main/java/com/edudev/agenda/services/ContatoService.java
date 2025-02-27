package com.edudev.agenda.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edudev.agenda.models.Contato;
import com.edudev.agenda.repositories.ContatoRepository;

@Service
public class ContatoService {

	@Autowired
	private ContatoRepository contatoRepository;
	
	public Contato salvar(Contato contato) {
		if (contatoRepository.findByCelular(contato.getCelular()).isPresent()) {
			throw new RuntimeException("Número de celular já cadastrado. Favor informar outro!");
			
		}
		
		return contatoRepository.save(contato);
		
	}
}
