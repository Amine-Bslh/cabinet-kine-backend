package com.cabinetkine.cabinet_kine_backend.repository;

import com.cabinetkine.cabinet_kine_backend.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {


}
