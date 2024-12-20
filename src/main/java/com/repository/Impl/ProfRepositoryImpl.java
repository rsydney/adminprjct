package com.repository.Impl;


import com.entity.Prof;
import com.repository.BaseRepositoryImpl;
import com.repository.ProfRepository;

public class ProfRepositoryImpl extends BaseRepositoryImpl<Prof> implements ProfRepository {

    @Override
    public Prof findByNom(String nom) {
        return findAll().stream()
            .filter(prof -> prof.getNom().equalsIgnoreCase(nom))
            .findFirst()
            .orElse(null);
    }
}

