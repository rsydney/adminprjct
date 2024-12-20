package com.repository;

import java.util.List;

import com.entity.Cours;

public interface CoursRepository extends BaseRepository<Cours> {
    List<Cours> findByProfesseur(String professeur);
}

