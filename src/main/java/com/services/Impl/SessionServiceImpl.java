package com.services.Impl;

import java.util.List;
import java.util.stream.Collectors;

import com.entity.Session;
import com.services.SessionService;

public class SessionServiceImpl extends BaseServiceImpl<Session> implements SessionService {

    @Override
    public List<Session> getSessionsByCours(String cours) {
        return getAll().stream()
            .filter(session -> session.getSalle().equals(cours)) 
            .collect(Collectors.toList());
    }
}

