package com.cabinetkine.cabinet_kine_backend.controller;

import com.cabinetkine.cabinet_kine_backend.model.Patient;
import com.cabinetkine.cabinet_kine_backend.service.PatientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/patients")
public class PatientController {

    private final PatientService patientService;

    public PatientController(PatientService patientService){
        this.patientService = patientService;
    }

    @GetMapping
    public List<Patient> listerPatients(){
        return patientService.listerPatient();
    }

    @PostMapping
    public Patient creerPatient(@RequestBody Patient patient){
        return patientService.creerPatient(patient);
    }

    @GetMapping("/{id}")
    public Patient trouverParId(@PathVariable Long id){
        return patientService.trouverParId(id);
    }
}
