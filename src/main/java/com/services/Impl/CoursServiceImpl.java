package com.services.Impl;

import java.util.List;
import java.util.stream.Collectors;

import com.entity.Cours;
import com.services.CoursService;

public class CoursServiceImpl extends BaseServiceImpl<Cours> implements CoursService {
    
    @Override
    public List<Cours> getCoursByProfesseur(String professeur) {
        return getAll().stream()
            .filter(cours -> cours.getProf().getNom().equals(professeur))
            .collect(Collectors.toList());
    }

    @Override
    public List<Cours> getCoursByClasse(String classe) {
        return getAll().stream()
            .filter(cours -> cours.getClasses().stream().anyMatch(c -> c.getNom().equals(classe)))
            .collect(Collectors.toList());
    }

    @Override
    public List<Cours> getCoursByNiveau(String niveau) {
        return getAll().stream()
            .filter(cours -> cours.getClasses().stream()
                .anyMatch(c -> c.getNiveau().getNom().equals(niveau)))
            .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "CoursServiceImpl []";
    }
}

