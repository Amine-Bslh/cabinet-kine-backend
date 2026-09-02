package com.cabinetkine.cabinet_kine_backend.service;

import com.cabinetkine.cabinet_kine_backend.model.Seance;
import com.cabinetkine.cabinet_kine_backend.repository.SeanceRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SeanceService {

    private final SeanceRepository seanceRepository;

    public SeanceService(SeanceRepository seanceRepository) {
        this.seanceRepository = seanceRepository;
    }

    public Seance creerSeance(Seance seance) {
        return seanceRepository.save(seance);
    }

    public List<Seance> listerSeances() {
        return seanceRepository.findAll();
    }

    public Seance trouverParId(Long id) {
        return seanceRepository.findById(id).orElse(null);
    }

}