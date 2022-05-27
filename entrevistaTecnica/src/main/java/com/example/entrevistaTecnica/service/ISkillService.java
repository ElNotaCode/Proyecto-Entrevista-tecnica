package com.example.entrevistaTecnica.service;

import java.util.List;

import com.example.entrevistaTecnica.dto.Skill;

/**
 * @author Eloi Martorell Martín
 *
 */

public interface ISkillService {
	
	//Metodos del CRUD.
	
	public List<Skill> listarSkills();	//Listar todas las skills.
	
	public Skill createSkill(Skill skill); //Create.
	
	public Skill readSkill(int id); //Read.
	
	public Skill updateSkill(Skill skill); //Update.
	
	public void deleteSkill(int id); //Delete.

}
