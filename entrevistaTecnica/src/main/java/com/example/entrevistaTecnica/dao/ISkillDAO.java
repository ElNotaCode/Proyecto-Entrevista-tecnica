package com.example.entrevistaTecnica.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entrevistaTecnica.dto.Skill;

/**
 * @author Eloi Martorell Martín
 *
 */

public interface ISkillDAO extends JpaRepository<Skill, Integer> {

}
