package com.cabinetkine.cabinet_kine_backend.controller;

import com.cabinetkine.cabinet_kine_backend.model.DiagnosticCorporel;
import com.cabinetkine.cabinet_kine_backend.service.DiagnosticCorporelService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/diagnostics")
public class DiagnosticCorporelController {

    private final DiagnosticCorporelService diagnosticCorporelService;

    public DiagnosticCorporelController(DiagnosticCorporelService diagnosticCorporelService) {
        this.diagnosticCorporelService = diagnosticCorporelService;
    }

    @GetMapping
    public List<DiagnosticCorporel> listerDiagnostics() {
        return diagnosticCorporelService.listerDiagnostics();
    }

    @PostMapping
    public DiagnosticCorporel creerDiagnostic(@Valid @RequestBody DiagnosticCorporel diagnostic) {
        return diagnosticCorporelService.creerDiagnostic(diagnostic);
    }

    @GetMapping("/{id}")
    public DiagnosticCorporel trouverParId(@PathVariable Long id) {
        return diagnosticCorporelService.trouverParId(id);
    }

}