package com.ajeff.clindor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ajeff.clindor.model.Servico;
import com.ajeff.clindor.repository.Servicos;

@Service
public class ServicoService {
	
	@Autowired
	private Servicos repository;
	
	public List<Servico> listarTodos(){
		return repository.findAll();
	}

	@Transactional
	public void salvar(Servico servico) {
		repository.save(servico);
	}

}
