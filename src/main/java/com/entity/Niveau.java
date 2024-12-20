package com.entity;

import java.util.List;

import lombok.Data;

@Data 

public class Niveau implements Identifiable {
    private Long id;
    private String nom;
    private List<Classe> classes;
    public Niveau(Long id, String nom, List<Classe> classes) {
        this.id = id;
        this.nom = nom;
        this.classes = classes;
    }


}

    