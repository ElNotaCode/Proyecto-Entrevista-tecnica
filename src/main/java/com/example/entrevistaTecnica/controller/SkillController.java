package com.example.entrevistaTecnica.controller;

/**
 * @author Eloi Martorell Martín
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.entrevistaTecnica.dto.Skill;
import com.example.entrevistaTecnica.service.SkillServiceImpl;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
public class SkillController {

	@Autowired
	SkillServiceImpl skillServiceImpl;
	
	//Listar.
	@GetMapping("/skills")
	public List<Skill> listarSkills() 
	{
		return skillServiceImpl.listarSkills();
	}
	
	//Create.
	@PostMapping("/skills")
	public Skill createSkill(@RequestBody Skill skill) 
	{
		return skillServiceImpl.createSkill(skill);
	}
	
	//Read.
	@GetMapping("/skills/{id}")
	public Skill readSkill(@PathVariable(name="id")int id) 
	{
		return skillServiceImpl.readSkill(id);
	}
	
	//Update.
	@PutMapping("/skills/{id}")
	public Skill updateSkill(@PathVariable(name="id")int id, @RequestBody Skill skill) 
	{
		
		Skill skill_seleccionada = new Skill();
		Skill skill_actualizada = new Skill();
		
		skill_seleccionada = skillServiceImpl.readSkill(id);
		
		skill_seleccionada.setSkill_name(skill.getSkill_name());
		
		skill_actualizada = skillServiceImpl.updateSkill(skill_seleccionada);
		
		return skill_actualizada;
	}
	
	//Delete
	@DeleteMapping("/skills/{id}")
	public void deleteSkill(@PathVariable(name="id")int id) 
	{
		skillServiceImpl.deleteSkill(id);
	}
	
}
