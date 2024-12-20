package com.entity;

import lombok.Data;

@Data 

public class Prof implements Identifiable {
    private Long id;
    private String nom;
    private String email;
    public Prof(Long id, String nom, String email) {
        this.id = id;
        this.nom = nom;
        this.email = email;
    }
}
