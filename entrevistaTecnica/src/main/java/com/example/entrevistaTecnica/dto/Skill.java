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

import org.hibernate.annotations.Fetch;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @Autor Eloi Martorell Martín
 * */

@Entity
@Table(name="skill")
public class Skill
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_skill;
	
	@Column(name="SKILL_NAME")
	private String skill_name;
	
	@OneToMany
	@JoinColumn(name="ID_SKILL")
	List<CandidateSkill> candidateSkill;
	
	//Constructors.
	
	//Default constructor.
	public Skill()
	{
		
	}
	
	/**
	 * @param id
	 * @param skill_name
	 * @param candidate_skill
	 */
	public Skill(int id_skill, String skill_name, List<CandidateSkill> candidateSkill)
	{
		super();
		this.id_skill = id_skill;
		this.skill_name = skill_name;
		this.candidateSkill = candidateSkill;
	}
	
	//Getter & Setters

	/**
	 * @return the id
	 */
	public int getId_skill() 
	{
		return id_skill;
	}

	/**
	 * @param id_skill the id_skill to set
	 */
	public void setId_skill(int id_skill) 
	{
		this.id_skill = id_skill;
	}

	/**
	 * @return the skill name
	 */
	public String getSkill_name() 
	{
		return skill_name;
	}

	/**
	 * @param skill_name the skill_name to set
	 */
	public void setSkill_name(String skill_name) 
	{
		this.skill_name = skill_name;
	}

	/**
	 * @return the list of candidate skills
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "CandidateSkill")
	public List<CandidateSkill> getCandidateSkill() 
	{
		return candidateSkill;
	}

	/**
	 * @param candidateSkill the candidateSkill to set
	 */
	public void setCandidateSkill(List<CandidateSkill> candidateSkill) 
	{
		this.candidateSkill = candidateSkill;
	}

	@Override
	public String toString() 
	{
		return "Skill [id_skill=" + id_skill + ", skill_name=" + skill_name + "]";
	}

}
