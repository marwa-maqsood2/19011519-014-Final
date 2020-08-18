package com.webservice.patient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webservice.patient.entity.Patient;
import com.webservice.patient.service.PatientService;

@RestController
public class PatientController {

	@Autowired
	private PatientService patientService;
	
	@RequestMapping("/patient")
	public String inPatient() {
		return "In Patient Controller of timetable webservice project!!! ";
	}
	
	@PostMapping("/patient/saveOne")
	public Patient saveOne(@RequestBody Patient patient) {
		return patientService.saveOne(patient);
	}
	
	@PostMapping("/patient/saveMany")
	public List<Patient> saveMany(@RequestBody List<Patient> patients) {
		return patientService.saveMany(patients);
	}
	
	@GetMapping("/patient/displayAllPatients")
	public List<Patient> getOnePatient() {
		return patientService.getAll();
	}
	
	@GetMapping("/patient/displayOnePatient/{id}")
	public Patient getOnePatient(@PathVariable int id) {
		return patientService.getOne(id);
	}
	
	@DeleteMapping("/patient/deleteOnePatient/{id}")
	public String deleteOnePatient(@PathVariable int id) {
		patientService.deletePatient(id);
		return " Record with " + id + " is deleted!!!";
	}
	
	@PutMapping("/patient/updateOnePatient")
	public Patient updateOnePatient(@RequestBody  Patient patient) {
		return patientService.saveOne(patient);
	}
}
