package com.entity;

import lombok.Data;
import java.util.List;

@Data

public class Cours implements Identifiable {
    private Long id;
    private String nom;
    private Prof prof;
    private List<Classe> classes;
    private Module module;
    public Cours(Long id, String nom, Prof prof, List<Classe> classes, Module module) {
        this.id = id;
        this.nom = nom;
        this.prof = prof;
        this.classes = classes;
        this.module = module;
    }

}
