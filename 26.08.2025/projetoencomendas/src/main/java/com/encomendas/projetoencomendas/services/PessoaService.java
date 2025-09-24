package com.encomendas.projetoencomendas.services;

import org.springframework.stereotype.Service;

import com.encomendas.projetoencomendas.repositories.PessoaRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PessoaService {
    private PessoaRepository pessoaRepository;
}
