package com.example.entrevistaTecnica.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Eloi Martorell Martín
 * @reviewed Marc Lopez
 */

@Entity
@Table(name="candidate_skill")
public class CandidateSkill {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_CANDIDATE_SKILL")
	private int id_candidate_skill;
	
	@Column(name="VALUE_NUMBER")
	private float value_number;
	@Column(name="NOTES")
	private String notes;
	
	@ManyToOne
	@JoinColumn(name="FK_ID_SKILL")
	Skill skill;
	
	@ManyToOne
	@JoinColumn(name="FK_ID_CANDIDATE")
	Candidate candidate;
	
	//Constructors.
	
	//Default.
	public CandidateSkill() 
	{
		
	}

	/**
	 * 
	 * @param id_candidate_skill
	 * @param value_number
	 * @param notes
	 * @param skill
	 * @param candidate
	 */
	
	public CandidateSkill(int id_candidate_skill, float value_number, String notes, Skill skill, Candidate candidate) 
	{
		this.id_candidate_skill = id_candidate_skill;
		this.value_number = value_number;
		this.notes = notes;
		this.skill = skill;
		this.candidate = candidate;
	}
	
	//Getters & Setters.

	/**
	 * 
	 * @return id_candidate_skill
	 */
	public int getId_candidate_skill() {
		return id_candidate_skill;
	}

	/**
	 * 
	 * @param id_candidate_skill
	 */
	public void setId_candidate_skill(int id_candidate_skill) {
		this.id_candidate_skill = id_candidate_skill;
	}

	/**
	 * 
	 * @return value_number
	 */
	public float getValue_number() {
		return value_number;
	}
	
	/**
	 * 
	 * @param value_number
	 */
	public void setValue_number(float value_number) {
		this.value_number = value_number;
	}

	/**
	 * 
	 * @return notes
	 */
	public String getNotes() {
		return notes;
	}

	/**
	 * 
	 * @param notes
	 */
	public void setNotes(String notes) {
		this.notes = notes;
	}

	/**
	 * 
	 * @return skill
	 */
	public Skill getSkill() {
		return skill;
	}

	/**
	 * 
	 * @param skill
	 */
	public void setSkill(Skill skill) {
		this.skill = skill;
	}

	/**
	 * 
	 * @return candidate
	 */
	public Candidate getCandidate() {
		return candidate;
	}

	/**
	 * 
	 * @param candidate
	 */
	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}

	@Override
	public String toString() {
		return "CandidateSkill [id_candidate_skill=" + id_candidate_skill + ", value_number=" + value_number
				+ ", notes=" + notes + ", skill=" + skill + ", candidate=" + candidate + "]";
	}


}
