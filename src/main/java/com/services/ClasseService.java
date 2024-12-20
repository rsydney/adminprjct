package com.services;

import java.util.List;

import com.entity.Classe;

public interface ClasseService extends BaseService<Classe> {
    List<Classe> getClassesByNiveau(String niveau);
}

