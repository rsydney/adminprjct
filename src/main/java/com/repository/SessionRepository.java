package com.repository;

import java.util.List;

import com.entity.Session;

public interface SessionRepository extends BaseRepository<Session> {
    List<Session> findByCours(String cours);
}

