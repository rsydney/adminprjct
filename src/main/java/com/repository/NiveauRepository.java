package com.repository;

import com.entity.Niveau;

public interface NiveauRepository extends BaseRepository<Niveau> {
    Niveau findByNom(String nom);
}

