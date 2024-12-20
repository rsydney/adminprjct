package com.services.Impl;

import java.util.List;
import java.util.stream.Collectors;

import com.entity.Classe;
import com.services.ClasseService;

public class ClasseServiceImpl extends BaseServiceImpl<Classe> implements ClasseService {

    @Override
    public List<Classe> getClassesByNiveau(String niveau) {
        return getAll().stream()
            .filter(classe -> classe.getNiveau().getNom().equals(niveau))
            .collect(Collectors.toList());
    }
}

