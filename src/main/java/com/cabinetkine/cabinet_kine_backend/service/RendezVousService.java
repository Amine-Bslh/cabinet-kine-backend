package com.cabinetkine.cabinet_kine_backend.service;

import com.cabinetkine.cabinet_kine_backend.model.RendezVous;
import com.cabinetkine.cabinet_kine_backend.repository.RendezVousRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RendezVousService {

    private final RendezVousRepository rendezVousRepository;

    public RendezVousService(RendezVousRepository rendezVousRepository) {
        this.rendezVousRepository = rendezVousRepository;
    }

    public RendezVous creerRendezVous(RendezVous rendezVous) {
        return rendezVousRepository.save(rendezVous);
    }

    public List<RendezVous> listerRendezVous() {
        return rendezVousRepository.findAll();
    }

    public RendezVous trouverParId(Long id) {
        return rendezVousRepository.findById(id).orElse(null);
    }

}