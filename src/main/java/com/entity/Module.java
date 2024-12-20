package com.entity;

import lombok.Data;

@Data

public class Module implements Identifiable {
    private Long id;
    private String nom;
    private String description;
    public Module(Long id, String nom, String description) {
        this.id = id;
        this.nom = nom;
        this.description = description;
    }
}
