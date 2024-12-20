package com.repository;

import java.util.List;

import com.entity.Classe;

public interface ClasseRepository extends BaseRepository<Classe> {
    List<Classe> findByNiveau(String niveau);
}

