package com.encomendas.projetoencomendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.encomendas.projetoencomendas.entities.VendedorEntity;

@Repository
public interface VendedorRepository extends JpaRepository<VendedorEntity, Integer>{

}
