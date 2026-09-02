package com.cabinetkine.cabinet_kine_backend.repository;

import com.cabinetkine.cabinet_kine_backend.model.Paiement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaiementRepository extends JpaRepository<Paiement, Long> {
}
