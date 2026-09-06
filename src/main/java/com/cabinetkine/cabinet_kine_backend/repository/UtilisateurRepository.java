package com.cabinetkine.cabinet_kine_backend.repository;

import com.cabinetkine.cabinet_kine_backend.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {

    Optional<Utilisateur> findByEmail(String email);
}
