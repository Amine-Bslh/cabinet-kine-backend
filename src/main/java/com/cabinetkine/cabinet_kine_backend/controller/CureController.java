package com.cabinetkine.cabinet_kine_backend.controller;

import com.cabinetkine.cabinet_kine_backend.model.Cure;
import com.cabinetkine.cabinet_kine_backend.service.CureService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cures")
public class CureController {

    private final CureService cureService;

    public CureController(CureService cureService) {
        this.cureService = cureService;
    }

    @GetMapping
    public List<Cure> listerCures() {
        return cureService.listerCures();
    }

    @PostMapping
    public Cure creerCure(@Valid @RequestBody Cure cure) {
        return cureService.creerCure(cure);
    }

    @GetMapping("/{id}")
    public Cure trouverParId(@PathVariable Long id) {
        return cureService.trouverParId(id);
    }

}