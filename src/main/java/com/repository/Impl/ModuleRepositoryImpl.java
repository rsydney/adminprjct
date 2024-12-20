package com.repository.Impl;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.repository.ModuleRepository;

public class ModuleRepositoryImpl implements ModuleRepository {

    private final List<Module> modules;

    public ModuleRepositoryImpl() {
        this.modules = new ArrayList<>();
    }

    @Override
    public void create(Module module) {
        modules.add(module);
    }

    @Override
    public List<Module> getAll() {
        return modules;
    }

    @Override
    public Module getById(Long id) {
        Optional<Module> moduleOpt = modules.stream()
                .filter(module -> module.getId().equals(id))
                .findFirst();
        return moduleOpt.orElse(null); 
    }

    @Override
    public void update(Module module) {
        for (int i = 0; i < modules.size(); i++) {
            if (modules.get(i).getId().equals(module.getId())) {
                modules.set(i, module);
                return;
            }
        }
    }

    @Override
    public void delete(Long id) {
        modules.removeIf(module -> module.getId().equals(id));
    }

    public List<Module> getModules() {
        return modules;
    }
}