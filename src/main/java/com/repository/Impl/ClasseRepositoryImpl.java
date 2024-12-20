package com.repository.Impl;

import java.util.List;
import java.util.stream.Collectors;

import com.entity.Classe;
import com.repository.BaseRepositoryImpl;
import com.repository.ClasseRepository;

public class ClasseRepositoryImpl extends BaseRepositoryImpl<Classe> implements ClasseRepository {

    @Override
    public List<Classe> findByNiveau(String niveau) {
        return findAll().stream()
            .filter(classe -> classe.getNiveau().getNom().equals(niveau))
            .collect(Collectors.toList());
    }
}

