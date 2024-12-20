package com.services.Impl;

import java.util.List;

import com.repository.BaseRepository;
import com.services.BaseService;

public class BaseServiceImpl<T> implements BaseService<T> {  

    private final BaseRepository<T> repository;


    public BaseServiceImpl(BaseRepository<T> repository) {
        this.repository = repository;
    }

    @Override
    public void create(T entity) {
        repository.save(entity);  
    }

    @Override
    public List<T> getAll() {
        return repository.findAll();  
    }

    @Override
    public T getById(Long id) {
        return repository.findById(id).orElse(null);  
    }

    @Override
    public void delete(Long id) {
        repository.delete(id);  
    }
}
