package com.services.Impl;

import java.util.List;
import java.util.stream.Collectors;

import com.entity.Prof;
import com.services.ProfService;

public class ProfServiceImpl extends BaseServiceImpl<Prof> implements ProfService {

    @Override
    public Prof findByNom(String nom) {
        return getAll().stream()
            .filter(professeur -> professeur.getNom().equalsIgnoreCase(nom))
            .findFirst()
            .orElse(null);
    }
}

