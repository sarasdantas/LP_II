package com.encomendas.projetoencomendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.encomendas.projetoencomendas.entities.ContatoEntity;

@Repository
public interface ContatoRepository extends JpaRepository<ContatoEntity, Integer> {

}
