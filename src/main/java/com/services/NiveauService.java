package com.services;

import com.entity.Niveau;

public interface NiveauService extends BaseService<Niveau> {
    Niveau findByNom(String nom);
}

