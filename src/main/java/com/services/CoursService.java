package com.services;

import java.util.List;

import com.entity.Cours;

public interface CoursService extends BaseService<Cours> {
    List<Cours> getCoursByProfesseur(String professeur);
    List<Cours> getCoursByClasse(String classe);
    List<Cours> getCoursByNiveau(String niveau);
}

