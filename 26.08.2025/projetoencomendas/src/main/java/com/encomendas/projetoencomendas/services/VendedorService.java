package com.encomendas.projetoencomendas.services;

import org.springframework.stereotype.Service;

import com.encomendas.projetoencomendas.repositories.VendedorRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class VendedorService {
    private VendedorRepository vendedorRepository;
}
