package com.repository.Impl;



import com.entity.Niveau;
import com.repository.BaseRepositoryImpl;
import com.repository.NiveauRepository;

public class NiveauRepositoryImpl extends BaseRepositoryImpl<Niveau> implements NiveauRepository {

    @Override
    public Niveau findByNom(String nom) {
        return findAll().stream()
            .filter(niveau -> niveau.getNom().equalsIgnoreCase(nom))
            .findFirst()
            .orElse(null);
    }
}

