package com.example.entrevistaTecnica.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.example.entrevistaTecnica.dto.Position;
import com.example.entrevistaTecnica.dto.Candidate;

@Entity
@Table(name = "candidate_position")
public class CandidatePosition {

	// Atributos de la entidad candidate_position
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Temporal(TemporalType.DATE)
	private Date registryDate;

	@Temporal(TemporalType.DATE)
	private Date testDate;

	@Temporal(TemporalType.DATE)
	private Date completionDate;

	@Column(name = "RESULT")
	private float result;

	@ManyToOne
	@JoinColumn(name = "FK_ID_POSITION")
	Position position;

	@ManyToOne
	@JoinColumn(name = "FK_ID_CANDIDATE")
	Candidate candidate;

	// Constructores
	public CandidatePosition() {

	}

	public CandidatePosition(int id, Date registryDate, Date testDate, Date completionDate, float result,
			Position position, Candidate candidate) {

		this.id = id;
		this.registryDate = registryDate;
		this.testDate = testDate;
		this.completionDate = completionDate;
		this.result = result;
		this.position = position;
		this.candidate = candidate;
	}

	// Getters & Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getRegistryDate() {
		return registryDate;
	}

	public void setRegistryDate(Date registryDate) {
		this.registryDate = registryDate;
	}

	public Date getTestDate() {
		return testDate;
	}

	public void setTestDate(Date testDate) {
		this.testDate = testDate;
	}

	public Date getCompletionDate() {
		return completionDate;
	}

	public void setCompletionDate(Date completionDate) {
		this.completionDate = completionDate;
	}

	public float getResult() {
		return result;
	}

	public void setResult(float result) {
		this.result = result;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public Candidate getCandidate() {
		return candidate;
	}

	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}

	@Override
	public String toString() {
		return "CandidatePosition [id=" + id + ", registryDate=" + registryDate + ", testDate=" + testDate
				+ ", completionDate=" + completionDate + ", result=" + result + "]";
	}

}
