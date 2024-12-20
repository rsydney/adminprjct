package com.services;


import com.entity.Prof;

public interface ProfService extends BaseService<Prof> {
    Prof findByNom(String nom);
}

