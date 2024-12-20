package com.services.Impl;

import java.util.List;
import java.util.stream.Collectors;

import com.entity.Niveau;
import com.services.NiveauService;

public class NiveauServiceImpl extends BaseServiceImpl<Niveau> implements NiveauService {

    @Override
    public Niveau findByNom(String nom) {
        return getAll().stream()
            .filter(niveau -> niveau.getNom().equalsIgnoreCase(nom))
            .findFirst()
            .orElse(null);
    }
}
