package com.encomendas.projetoencomendas.services;

import org.springframework.stereotype.Service;

import com.encomendas.projetoencomendas.repositories.ContatoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ContatoService {
    private ContatoRepository contatoRepository;
}