package com.cabinetkine.cabinet_kine_backend.repository;

import com.cabinetkine.cabinet_kine_backend.model.Seance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeanceRepository extends JpaRepository<Seance, Long> {
}
