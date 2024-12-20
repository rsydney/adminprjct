package com.services;


public interface ModuleService extends BaseService<Module> {
    Module findByNom(String nom);
}
