package com.webservice.patient.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webservice.patient.repository.PatientRepository;
import com.webservice.patient.entity.Patient;

@Service
public class PatientService {
	@Autowired
	private PatientRepository patientRepository;
	
	public Patient saveOne(Patient patient) {
		return patientRepository.save(patient);
	}
	
	public List<Patient> saveMany(List<Patient> patients) {
		return patientRepository.saveAll(patients);
	}
	
	public List<Patient> getAll() {
		return patientRepository.findAll();
	}
	
	public Patient getOne(int id) {
		return patientRepository.findById(id).orElse(null);
	}
	public void deletePatient(int id) {
		patientRepository.deleteById(id); 
	}
	public Patient updatePatient(Patient patient) {
		Patient existingPatient = patientRepository.findById(patient.getPATIENT_ID()).orElse(null);
		existingPatient.setPATIENT_NAME(patient.getPATIENT_NAME());
		existingPatient.setPATIENT_AGE(patient.getPATIENT_AGE());
		existingPatient.setPATIENT_ILLNESS(patient.getPATIENT_ILLNESS());
		existingPatient.setPATIENT_SURGERIES(patient.getPATIENT_SURGERIES());
		return patientRepository.save(existingPatient);
	}

}
