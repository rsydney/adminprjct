package com.repository;


import java.util.List;

public interface ModuleRepository {
    void create(Module module);
    List<Module> getAll();
    Module getById(Long id);
    Module getId(Long id);
    void update(Module module);
    void delete(Long id);
}

