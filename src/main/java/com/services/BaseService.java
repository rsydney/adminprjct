package com.services;

import java.util.List;

public interface BaseService<T> {  // T est défini comme un paramètre générique ici
    void create(T entity);
    List<T> getAll();
    T getById(Long id);
    void delete(Long id);
}
