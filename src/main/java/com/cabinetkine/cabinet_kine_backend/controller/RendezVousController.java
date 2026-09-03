package com.cabinetkine.cabinet_kine_backend.controller;

import com.cabinetkine.cabinet_kine_backend.model.RendezVous;
import com.cabinetkine.cabinet_kine_backend.service.RendezVousService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rendezvous")
public class RendezVousController {

    private final RendezVousService rendezVousService;

    public RendezVousController(RendezVousService rendezVousService){
        this.rendezVousService = rendezVousService;
    }

    @GetMapping
    public List<RendezVous> listerRendezVous(){
        return rendezVousService.listerRendezVous();
    }

    @PostMapping
    public RendezVous creerRendezVous(@Valid @RequestBody RendezVous rendezVous){
        return rendezVousService.creerRendezVous(rendezVous);
    }

    @GetMapping("/{id}")
    public RendezVous trouverRendezVous(@PathVariable Long id){
        return rendezVousService.trouverParId(id);
    }

}
