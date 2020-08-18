package com.webservice.patient.entity;



	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.Id;
	import javax.persistence.Table;

	import lombok.AllArgsConstructor;
	import lombok.Data;
	import lombok.NoArgsConstructor;

	@Data
	@Entity
	@NoArgsConstructor
	@AllArgsConstructor
	@Table(name = "patient")

	public class Patient {
		@Id
		@GeneratedValue
		@Column(name = "patientid")
		private int PATIENT_ID;
		
		@Column(name = "patient_name")
		private String PATIENT_NAME;
		
		@Column(name = "patient_age")
		private String PATIENT_AGE;
		
		@Column(name = "patient_illness")
		private String PATIENT_ILLNESS;
		
		@Column(name = "patient_surgeries")
		private String PATIENT_SURGERIES;
		
		public Patient() {
		}
		public Patient(int pATIENT_ID, String pATIENT_NAME, String pATIENT_AGE , String pATIENT_ILLNESS, String pATIENT_SURGERIES) {
			super();
			PATIENT_ID=pATIENT_ID;
			PATIENT_NAME = pATIENT_NAME;
			PATIENT_AGE = pATIENT_AGE;
			PATIENT_ILLNESS=pATIENT_ILLNESS;
			PATIENT_ILLNESS =pATIENT_SURGERIES;
		}
		
		
		
		

		public int getPATIENT_ID() {
			return PATIENT_ID;
		}

		public void setPATIENT_ID(int pATIENT_ID) {
			PATIENT_ID = pATIENT_ID;
		}

		public String getPATIENT_NAME() {
			return PATIENT_NAME;
		}

		public void setPATIENT_NAME(String pATIENT_NAME) {
			PATIENT_NAME = pATIENT_NAME;
		}

		public String getPATIENT_AGE() {
			return PATIENT_AGE;
		}

		public void setPATIENT_AGE(String pATIENT_AGE) {
			PATIENT_AGE = pATIENT_AGE;
		}

		public String getPATIENT_ILLNESS() {
			return PATIENT_ILLNESS;
		}

		public void setPATIENT_ILLNESS(String pATIENT_ILLNESS) {
			PATIENT_ILLNESS = pATIENT_ILLNESS;
		}

		public String getPATIENT_SURGERIES() {
			return PATIENT_SURGERIES;
		}

		public void setPATIENT_SURGERIES(String pATIENT_SURGERIES) {
			PATIENT_SURGERIES = pATIENT_SURGERIES;
		}
		
		
		
		
		
		
		
		
		
		
		}
		