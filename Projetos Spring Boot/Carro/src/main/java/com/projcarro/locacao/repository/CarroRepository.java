package com.projcarro.locacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projcarro.locacao.model.Carro;

@Repository
public interface CarroRepository extends  JpaRepository<Carro, Integer> { }   


