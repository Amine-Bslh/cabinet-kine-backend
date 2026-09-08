package com.cabinetkine.cabinet_kine_backend.service;

import com.cabinetkine.cabinet_kine_backend.model.DiagnosticCorporel;
import com.cabinetkine.cabinet_kine_backend.repository.DiagnosticCorporelRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiagnosticCorporelService {

    private final DiagnosticCorporelRepository diagnosticCorporelRepository;

    public DiagnosticCorporelService(DiagnosticCorporelRepository diagnosticCorporelRepository) {
        this.diagnosticCorporelRepository = diagnosticCorporelRepository;
    }

    public DiagnosticCorporel creerDiagnostic(DiagnosticCorporel diagnostic) {
        return diagnosticCorporelRepository.save(diagnostic);
    }

    public List<DiagnosticCorporel> listerDiagnostics() {
        return diagnosticCorporelRepository.findAll();
    }

    public DiagnosticCorporel trouverParId(Long id) {
        return diagnosticCorporelRepository.findById(id).orElse(null);
    }

}