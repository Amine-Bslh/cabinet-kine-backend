package com.cabinetkine.cabinet_kine_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Seance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private LocalDate date;

    private String compteRendu;

    @OneToOne
    private RendezVous rendezVous;

    @ManyToOne
    private Prestation prestation;

    private BigDecimal poids;
    private BigDecimal mm;
    private BigDecimal pSusO;
    private BigDecimal po;
    private BigDecimal pSousO;
    private BigDecimal poitrine;
    private BigDecimal triceps;
    private BigDecimal mollet;
    private BigDecimal th;
    private BigDecimal cuisseDte;
    private BigDecimal cuisseGch;

}