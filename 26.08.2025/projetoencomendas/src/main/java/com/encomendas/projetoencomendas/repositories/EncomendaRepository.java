package com.encomendas.projetoencomendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.encomendas.projetoencomendas.entities.EncomendaEntity;

@Repository
public interface EncomendaRepository extends JpaRepository<EncomendaEntity, Integer>{

}
