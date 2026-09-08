package com.cabinetkine.cabinet_kine_backend.service;

import com.cabinetkine.cabinet_kine_backend.model.Prestation;
import com.cabinetkine.cabinet_kine_backend.repository.PrestationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrestationService {

    private final PrestationRepository prestationRepository;

    public PrestationService(PrestationRepository prestationRepository) {
        this.prestationRepository = prestationRepository;
    }

    public Prestation creerPrestation(Prestation prestation) {
        return prestationRepository.save(prestation);
    }

    public List<Prestation> listerPrestations() {
        return prestationRepository.findAll();
    }

    public Prestation trouverParId(Long id) {
        return prestationRepository.findById(id).orElse(null);
    }

}