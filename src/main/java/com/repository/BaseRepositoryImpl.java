package com.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.entity.Identifiable;

public class BaseRepositoryImpl<T> implements BaseRepository<T> {
    private final List<T> repository;

    public BaseRepositoryImpl() {
        this.repository = new ArrayList<>();
    }

    @Override
    public void save(T entity) {
        repository.add(entity);
    }

    @Override
    public Optional<T> findById(Long id) {
        return repository.stream()
                .filter(entity -> entity instanceof Identifiable && ((Identifiable) entity).getId().equals(id))
                .findFirst();
    }

    @Override
    public List<T> findAll() {
        return repository;
    }

    @Override
    public void delete(Long id) {
        repository.removeIf(entity -> entity instanceof Identifiable && ((Identifiable) entity).getId().equals(id));
    }
}

