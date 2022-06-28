package com.example.entrevistaTecnica.service;

import java.util.List;

import com.example.entrevistaTecnica.dto.CandidateSkill;

/**
 * @author Eloi Martorell Martín
 */

public interface ICandidateSkillService {
	
	//Metodos del CRUD.
	
	public List<CandidateSkill> listarCandidateSkills();	//Listar todas las skills.
	
	public CandidateSkill createCandidateSkill(CandidateSkill candidateSkill); //Create.
	
	public CandidateSkill readCandidateSkill(int id); //Read.
	
	public CandidateSkill updateCandidateSkill(CandidateSkill candidateSkill); //Update.
	
	public void deleteCandidateSkill(int id); //Delete.

}
