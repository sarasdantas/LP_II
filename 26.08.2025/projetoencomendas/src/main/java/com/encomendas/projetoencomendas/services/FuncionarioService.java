package com.encomendas.projetoencomendas.services;

import org.springframework.stereotype.Service;

import com.encomendas.projetoencomendas.repositories.FuncionarioRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class FuncionarioService {
    private FuncionarioRepository funcionarioRepository;
}
