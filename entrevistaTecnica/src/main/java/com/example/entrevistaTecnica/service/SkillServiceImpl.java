package com.example.entrevistaTecnica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entrevistaTecnica.dao.ISkillDAO;
import com.example.entrevistaTecnica.dto.Skill;

/**
 * @author Eloi Martorell Martín
 *
 */
	
@Service
public class SkillServiceImpl implements ISkillService
{
	
	//Utilizamos los metodos de la interface ISkillDAO, es como si instaciaramos.
	@Autowired
	ISkillDAO iSkillDAO;

	@Override
	public List<Skill> listarSkills() {
		return iSkillDAO.findAll();
	}

	@Override
	public Skill createSkill(Skill skill) {
		return iSkillDAO.save(skill);
	}

	@Override
	public Skill readSkill(int id) {
		return iSkillDAO.findById(id).get();
	}

	@Override
	public Skill updateSkill(Skill skill) {
		return iSkillDAO.save(skill);
	}

	@Override
	public void deleteSkill(int id) {
		iSkillDAO.deleteById(id);
	}

}
