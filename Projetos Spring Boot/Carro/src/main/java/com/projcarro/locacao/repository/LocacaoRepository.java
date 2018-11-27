package com.projcarro.locacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projcarro.locacao.model.Locacao;
@Repository
public interface LocacaoRepository extends JpaRepository<Locacao, Integer> { } 


