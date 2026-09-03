package com.cabinetkine.cabinet_kine_backend.controller;

import com.cabinetkine.cabinet_kine_backend.model.Seance;
import com.cabinetkine.cabinet_kine_backend.service.SeanceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/seances")
public class SeanceController {

    private final SeanceService seanceService;

    public SeanceController(SeanceService seanceService){
        this.seanceService = seanceService;
    }
    @GetMapping
    public List<Seance> listerSeances(){
        return seanceService.listerSeances();
    }

    @PostMapping
    public Seance creerSeance(@RequestBody Seance seance){
        return seanceService.creerSeance(seance);
    }

    @GetMapping("/{id}")
    public Seance trouverSeance(@PathVariable Long id){
        return seanceService.trouverParId(id);
    }


}
