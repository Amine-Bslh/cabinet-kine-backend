package com.cabinetkine.cabinet_kine_backend.controller;

import com.cabinetkine.cabinet_kine_backend.model.Paiement;
import com.cabinetkine.cabinet_kine_backend.service.PaiementService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/paiements")
public class PaiementController {

    private final PaiementService paiementService;

    public PaiementController(PaiementService paiementService){
        this.paiementService = paiementService;
    }

    @GetMapping
    public List<Paiement> listerPaiement(){
        return paiementService.listerPaiements();
    }

    @PostMapping
    public Paiement creerPaiement(@RequestBody Paiement paiement){
        return paiementService.creerPaiement(paiement);
    }

    @GetMapping("/{id}")
    public Paiement trouverPaiement(@PathVariable Long id){
        return paiementService.trouverParId(id);
    }
}
