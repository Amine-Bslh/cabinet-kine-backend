package com.cabinetkine.cabinet_kine_backend.repository;

import com.cabinetkine.cabinet_kine_backend.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {
}
