package com.projcarro.locacao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projcarro.locacao.model.Carro;
import com.projcarro.locacao.repository.CarroRepository;


@Service
public class CarroService {
	
	@Autowired
	private CarroRepository repository;

	public List<Carro> findAll() {
		return repository.findAll();
	}

	public Carro findOne(int id) {
		return repository.findOne(id);
	}

	public Carro save(Carro post) {
		return repository.saveAndFlush(post);
	}

	public void delete(int id) {
		repository.delete(id);
	}
}
