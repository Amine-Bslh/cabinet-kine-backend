package com.cabinetkine.cabinet_kine_backend.service;

import com.cabinetkine.cabinet_kine_backend.model.Cure;
import com.cabinetkine.cabinet_kine_backend.repository.CureRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CureService {

    private final CureRepository cureRepository;

    public CureService(CureRepository cureRepository) {
        this.cureRepository = cureRepository;
    }

    public Cure creerCure(Cure cure) {
        return cureRepository.save(cure);
    }

    public List<Cure> listerCures() {
        return cureRepository.findAll();
    }

    public Cure trouverParId(Long id) {
        return cureRepository.findById(id).orElse(null);
    }

}