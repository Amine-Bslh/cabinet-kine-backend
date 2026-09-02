package com.cabinetkine.cabinet_kine_backend.service;

import com.cabinetkine.cabinet_kine_backend.model.Patient;
import com.cabinetkine.cabinet_kine_backend.repository.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    private final PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository){
        this.patientRepository = patientRepository;
    }

    public Patient creerPatient(Patient patient){
        return patientRepository.save(patient);
    }

    public List<Patient> listerPatient(){
        return patientRepository.findAll();
    }

    public Patient trouverParId(Long id){
        return patientRepository.findById(id).orElse(null);
    }
}
