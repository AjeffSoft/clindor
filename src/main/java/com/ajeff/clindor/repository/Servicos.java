package com.ajeff.clindor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ajeff.clindor.model.Servico;

@Repository
public interface Servicos extends JpaRepository<Servico, Long>{

}
