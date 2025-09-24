package com.encomendas.projetoencomendas.services;

import org.springframework.stereotype.Service;

import com.encomendas.projetoencomendas.repositories.EncomendaRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EncomendaService {
    private EncomendaRepository encomendaRepository;
}
