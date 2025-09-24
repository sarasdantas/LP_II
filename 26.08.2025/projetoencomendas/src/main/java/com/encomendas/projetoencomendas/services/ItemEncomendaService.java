package com.encomendas.projetoencomendas.services;

import org.springframework.stereotype.Service;

import com.encomendas.projetoencomendas.repositories.ItemEncomendaRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ItemEncomendaService {
    private ItemEncomendaRepository itemencomendaRepository;
}
