package com.example.entrevistaTecnica.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entrevistaTecnica.dto.CandidateSkill;

/**
 * @author Eloi Martorell Martín
 *
 */

public interface ICandidateSkillDAO extends JpaRepository<CandidateSkill, Integer>{

}
