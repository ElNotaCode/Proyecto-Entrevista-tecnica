package com.example.entrevistaTecnica.controller;

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

import com.example.entrevistaTecnica.dto.CandidateSkill;
import com.example.entrevistaTecnica.service.CandidateSkillServiceImpl;

/**
 * 
 * @author Eloi Martorell Martín
 * @reviewed Marc Lopez
 */

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
public class CandidateSkillsController {
	
	@Autowired
	CandidateSkillServiceImpl candidateSkillsServiceImpl;
	
	@GetMapping("/candidateSkills")
	public List<CandidateSkill> listarCandidateSkills() 
	{
		return candidateSkillsServiceImpl.listarCandidateSkills();
	}

	@PostMapping("/candidateSkills")
	public CandidateSkill createCandidateSkill(@RequestBody CandidateSkill candidateSkill) 
	{
		return candidateSkillsServiceImpl.createCandidateSkill(candidateSkill);
	}

	@GetMapping("/candidateSkills/{id}")
	public CandidateSkill readCandidateSkill(@PathVariable(name="id") int id) 
	{
		return candidateSkillsServiceImpl.readCandidateSkill(id);
	}

	@PutMapping("/candidateSkills/{id}")
	public CandidateSkill updateCandidateSkill(@PathVariable(name="id") int id, @RequestBody CandidateSkill candidateSkill) 
	{
		CandidateSkill candidateSkill_seleccionada = new CandidateSkill();
		CandidateSkill candidateSkill_actualizada = new CandidateSkill();
		
		candidateSkill_seleccionada = candidateSkillsServiceImpl.readCandidateSkill(id);
		
		candidateSkill_seleccionada.setValue_number(candidateSkill.getValue_number());
		candidateSkill_seleccionada.setNotes(candidateSkill.getNotes());
		candidateSkill_seleccionada.setSkill(candidateSkill.getSkill());
		candidateSkill_seleccionada.setCandidate(candidateSkill.getCandidate());
		
		candidateSkill_actualizada = candidateSkillsServiceImpl.updateCandidateSkill(candidateSkill_seleccionada);
		
		return candidateSkill_actualizada;
	}

	@DeleteMapping("/candidateSkills/{id}")
	public void deleteCandidateSkill(@PathVariable(name="id") int id) 
	{
		candidateSkillsServiceImpl.deleteCandidateSkill(id);
	}

}
