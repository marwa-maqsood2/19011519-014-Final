package com.webservice.patient.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservice.patient.entity.Patient;

public interface PatientRepository extends JpaRepository<Patient,Integer>{

}
