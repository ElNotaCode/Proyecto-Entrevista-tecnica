package com.example.entrevistaTecnica.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author 
 * @reviewed Marc Lopez
 *
 */

@Entity
@Table(name = "candidate")
public class Candidate {

	// Atributos de la entidad Candidate
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_CANDIDATE")//no hace falta si se llama igual
	private int id;

	@Column(name = "CANDIDATE_NAME")
	private String candidate_name;

	@Column(name = "CANDIDATE_SURNAME")
	private String candidate_surname;

	@OneToMany
	@JoinColumn(name = "FK_ID_CANDIDATE")
	private List<CandidateSkill> candidateSkill;

	@OneToMany
	@JoinColumn(name = "FK_ID_CANDIDATE")
	private List<CandidatePosition> candidatePosition;

	// Constructores

	public Candidate() {
		super();
	}

	public Candidate(int id, String candidate_name, String candidate_surname, List<CandidateSkill> candidateSkill,
			List<CandidatePosition> candidatePosition) {
		super();
		this.id = id;
		this.candidate_name = candidate_name;
		this.candidate_surname = candidate_surname;
		this.candidateSkill = candidateSkill;
		this.candidatePosition = candidatePosition;
	}

	// Getters & Setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCandidate_name() {
		return candidate_name;
	}

	public void setCandidate_name(String candidate_name) {
		this.candidate_name = candidate_name;
	}

	public String getCandidate_surname() {
		return candidate_surname;
	}

	public void setCandidate_surname(String candidate_surname) {
		this.candidate_surname = candidate_surname;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "CandidateSkill")
	public List<CandidateSkill> getCandidateSkill() {
		return candidateSkill;
	}

	public void setCandidateSkill(List<CandidateSkill> candidateSkill) {
		this.candidateSkill = candidateSkill;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "CandidatePosition")
	public List<CandidatePosition> getCandidatePosition() {
		return candidatePosition;
	}

	public void setCandidatePosition(List<CandidatePosition> candidatePosition) {
		this.candidatePosition = candidatePosition;
	}

	@Override
	public String toString() {
		return "Candidate [id=" + id + ", candidate_name=" + candidate_name + ", candidate_surname=" + candidate_surname
				+ ", candidateSkill=" + candidateSkill + ", candidatePosition=" + candidatePosition + "]";
	}

}
