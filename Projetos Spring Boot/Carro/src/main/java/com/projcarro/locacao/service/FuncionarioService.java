package com.projcarro.locacao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projcarro.locacao.model.Funcionario;
import com.projcarro.locacao.repository.FuncionarioRepository;

@Service
public class FuncionarioService {
	
	@Autowired
	private FuncionarioRepository repository;

	public List<Funcionario> findAll() {
		return repository.findAll();
	}

	public Funcionario findOne(int id) {
		return repository.findOne(id);
	}

	public Funcionario save(Funcionario post) {
		return repository.saveAndFlush(post);
	}

	public void delete(int id) {
		repository.delete(id);
	}
}