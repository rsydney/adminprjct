package com.entity;

import lombok.Data;

@Data

public class Classe implements Identifiable {
    private Long id;
    private String nom;
    private Niveau niveau;
    
    public Classe(Long id, String nom, Niveau niveau) {
        this.id = id;
        this.nom = nom;
        this.niveau = niveau;
    }
}

