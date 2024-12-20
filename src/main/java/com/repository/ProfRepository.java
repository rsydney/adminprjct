package com.repository;

import com.entity.Prof;

public interface ProfRepository extends BaseRepository<Prof> {
    Prof findByNom(String nom);
}

