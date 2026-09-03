package com.cabinetkine.cabinet_kine_backend.controller;

import com.cabinetkine.cabinet_kine_backend.model.Utilisateur;
import com.cabinetkine.cabinet_kine_backend.service.UtilisateurService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/utilisateurs")
public class UtilisateurController {

    private final UtilisateurService utilisateurService;

    public UtilisateurController(UtilisateurService utilisateurService){
        this.utilisateurService = utilisateurService;
    }
    @GetMapping
    public List<Utilisateur> listerUtilisateurs(){
        return utilisateurService.listerUtilisateurs();
    }

    @PostMapping
    public Utilisateur creerUtilisateur(@Valid @RequestBody Utilisateur utilisateur){
        return utilisateurService.creerUtilisateur(utilisateur);
    }

    @GetMapping("/{id}")
    public Utilisateur trouverParId(@PathVariable Long id){
        return utilisateurService.trouverParId(id);
    }



}
