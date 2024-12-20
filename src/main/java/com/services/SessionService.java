package com.services;

import java.util.List;

import com.entity.Session;

public interface SessionService extends BaseService<Session> {
    List<Session> getSessionsByCours(String cours);
}

