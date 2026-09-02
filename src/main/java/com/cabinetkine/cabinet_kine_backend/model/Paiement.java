package com.cabinetkine.cabinet_kine_backend.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Paiement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal montant;
    private String moyen;
    private LocalDate date;

    @ManyToOne
    private RendezVous rendezVous;
}
