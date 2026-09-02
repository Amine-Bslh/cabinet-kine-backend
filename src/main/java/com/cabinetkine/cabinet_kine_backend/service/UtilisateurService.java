package com.cabinetkine.cabinet_kine_backend.service;

import com.cabinetkine.cabinet_kine_backend.model.Utilisateur;
import com.cabinetkine.cabinet_kine_backend.repository.UtilisateurRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UtilisateurService {

    private final UtilisateurRepository utilisateurRepository;

    public UtilisateurService(UtilisateurRepository utilisateurRepository) {
        this.utilisateurRepository = utilisateurRepository;
    }

    public Utilisateur creerUtilisateur(Utilisateur utilisateur) {
        return utilisateurRepository.save(utilisateur);
    }

    public List<Utilisateur> listerUtilisateurs() {
        return utilisateurRepository.findAll();
    }

    public Utilisateur trouverParId(Long id) {
        return utilisateurRepository.findById(id).orElse(null);
    }

}