package com.repository.Impl;

import java.util.List;
import java.util.stream.Collectors;

import com.entity.Cours;
import com.repository.BaseRepositoryImpl;
import com.repository.CoursRepository;

public class CoursRepositoryImpl extends BaseRepositoryImpl<Cours> implements CoursRepository {

@Override
    public List<Cours> findByProfesseur(String professeur) {
        return findAll().stream()
            .filter(cours -> cours.getProf().getNom().equals(professeur))
            .collect(Collectors.toList());
    }
}

