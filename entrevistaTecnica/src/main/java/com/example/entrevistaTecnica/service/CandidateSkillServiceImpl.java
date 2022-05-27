package com.example.entrevistaTecnica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entrevistaTecnica.dao.ICandidateSkillDAO;
import com.example.entrevistaTecnica.dto.CandidateSkill;

/**
 * 
 * @author Eloi Martorell Martín
 *
 */

@Service
public class CandidateSkillServiceImpl implements ICandidateSkillService{

	//Utilizamos los metodos de la interface ICandidateSkillDAO, es como si instaciaramos.
	@Autowired
	ICandidateSkillDAO iCandidateSkillDAO;

	@Override
	public List<CandidateSkill> listarCandidateSkills() 
	{
		return iCandidateSkillDAO.findAll();
	}

	@Override
	public CandidateSkill createCandidateSkill(CandidateSkill candidateSkill) 
	{
		return iCandidateSkillDAO.save(candidateSkill);
	}

	@Override
	public CandidateSkill readCandidateSkill(int id) 
	{
		return iCandidateSkillDAO.findById(id).get();
	}

	@Override
	public CandidateSkill updateCandidateSkill(CandidateSkill candidateSkill) 
	{
		return iCandidateSkillDAO.save(candidateSkill);
	}

	@Override
	public void deleteCandidateSkill(int id) 
	{
		iCandidateSkillDAO.deleteById(id);
	}
	
}
