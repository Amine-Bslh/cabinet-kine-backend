package com.cabinetkine.cabinet_kine_backend.service;

import com.cabinetkine.cabinet_kine_backend.model.Utilisateur;
import com.cabinetkine.cabinet_kine_backend.repository.UtilisateurRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UtilisateurService {

    private final UtilisateurRepository utilisateurRepository;
    private final PasswordEncoder passwordEncoder;

    public UtilisateurService(UtilisateurRepository utilisateurRepository, PasswordEncoder passwordEncoder) {
        this.utilisateurRepository = utilisateurRepository;
        this.passwordEncoder  = passwordEncoder;
    }

    public Utilisateur creerUtilisateur(Utilisateur utilisateur) {
        utilisateur.setMotDePasse(passwordEncoder.encode(utilisateur.getMotDePasse()));
        return utilisateurRepository.save(utilisateur);
    }

    public List<Utilisateur> listerUtilisateurs() {
        return utilisateurRepository.findAll();
    }

    public Utilisateur trouverParId(Long id) {
        return utilisateurRepository.findById(id).orElse(null);
    }

    public Utilisateur modifierUtilisateur(Long id, Utilisateur utilisateur) {
        utilisateur.setId(id);
        if (utilisateur.getMotDePasse() != null && !utilisateur.getMotDePasse().isBlank()) {
            utilisateur.setMotDePasse(passwordEncoder.encode(utilisateur.getMotDePasse()));
        }
        return utilisateurRepository.save(utilisateur);
    }

    public void supprimerUtilisateur(Long id) {
        try {
            utilisateurRepository.deleteById(id);
        } catch (Exception e) {
            throw new RuntimeException("Impossible de supprimer cet utilisateur : il a des rendez-vous associes.");
        }
    }

}