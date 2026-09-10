package com.cabinetkine.cabinet_kine_backend.controller;

import com.cabinetkine.cabinet_kine_backend.model.Prestation;
import com.cabinetkine.cabinet_kine_backend.service.PrestationService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/prestations")
public class PrestationController {

    private final PrestationService prestationService;

    public PrestationController(PrestationService prestationService) {
        this.prestationService = prestationService;
    }

    @GetMapping
    public List<Prestation> listerPrestations() {
        return prestationService.listerPrestations();
    }

    @PostMapping
    public Prestation creerPrestation(@Valid @RequestBody Prestation prestation) {
        return prestationService.creerPrestation(prestation);
    }

    @GetMapping("/{id}")
    public Prestation trouverParId(@PathVariable Long id) {
        return prestationService.trouverParId(id);
    }

    @PutMapping("/{id}")
    public Prestation modifierPrestation(@PathVariable Long id, @Valid @RequestBody Prestation prestation) {
        return prestationService.modifierPrestation(id, prestation);
    }

    @DeleteMapping("/{id}")
    public void supprimerPrestation(@PathVariable Long id) {
        prestationService.supprimerPrestation(id);
    }

}