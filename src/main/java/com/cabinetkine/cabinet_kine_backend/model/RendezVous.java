package com.cabinetkine.cabinet_kine_backend.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class RendezVous {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime date;
    private String status;
    @ManyToOne
    private Patient patient;
    @ManyToOne
    private Utilisateur creerPar;
}
