package com.repository.Impl;

import java.util.List;
import java.util.stream.Collectors;

import com.entity.Session;
import com.repository.BaseRepositoryImpl;
import com.repository.SessionRepository;

public class SessionRepositoryImpl extends BaseRepositoryImpl<Session> implements SessionRepository {

    @Override
    public List<Session> findByCours(String cours) {
        return findAll().stream()
            .filter(session -> session.getCours() != null && session.getCours().equals(cours))
            .collect(Collectors.toList());
    }
}

