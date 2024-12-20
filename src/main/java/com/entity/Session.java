package com.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import lombok.Data;


@Data 
public class Session implements Identifiable {
    private Long id;
    private LocalDate date;
    private LocalTime heureDebut;
    private LocalTime heureFin;
    private String salle;
    public Session(Long id, LocalDate date, LocalTime heureDebut, LocalTime heureFin, String salle) {
        this.id = id;
        this.date = date;
        this.heureDebut = heureDebut;
        this.heureFin = heureFin;
        this.salle = salle;
    }
    public Object getCours() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCours'");
    }
}
