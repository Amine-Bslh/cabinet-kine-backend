package com.cabinetkine.cabinet_kine_backend.service;

import com.cabinetkine.cabinet_kine_backend.model.Paiement;
import com.cabinetkine.cabinet_kine_backend.repository.PaiementRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PaiementService {

    private final PaiementRepository paiementRepository;

    public PaiementService(PaiementRepository paiementRepository) {
        this.paiementRepository = paiementRepository;
    }

    public Paiement creerPaiement(Paiement paiement) {
        return paiementRepository.save(paiement);
    }

    public List<Paiement> listerPaiements() {
        return paiementRepository.findAll();
    }

    public Paiement trouverParId(Long id) {
        return paiementRepository.findById(id).orElse(null);
    }

}