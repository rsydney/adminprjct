package com.services.Impl;

import java.util.List;
import java.util.stream.Collectors;

import com.services.ModuleService;

public class ModuleServiceImpl extends BaseServiceImpl<Module> implements ModuleService {

    @Override
    public Module findByNom(String nom) {
        return getAll().stream()
            .filter(module -> module.getNom().equalsIgnoreCase(nom))
            .findFirst()
            .orElse(null);
    }
}
