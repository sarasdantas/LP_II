package com.encomendas.projetoencomendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.encomendas.projetoencomendas.entities.ItemEncomendaEntity;

@Repository
public interface ItemEncomendaRepository extends JpaRepository<ItemEncomendaEntity, Integer>{

}
