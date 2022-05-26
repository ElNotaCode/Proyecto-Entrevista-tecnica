package com.example.entrevistaTecnica.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entrevistaTecnica.dto.Candidate;

public interface ICandidateDAO extends JpaRepository<Candidate, Integer>{
	
}
