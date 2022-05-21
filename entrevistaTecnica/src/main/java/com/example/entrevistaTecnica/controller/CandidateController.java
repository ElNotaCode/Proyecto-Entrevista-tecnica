package com.example.entrevistaTecnica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entrevistaTecnica.service.CandidateServiceImpl;
import com.example.entrevistaTecnica.dto.Candidate;

@RestController
@RequestMapping("/api")
public class CandidateController {
	
	@Autowired
	CandidateServiceImpl candidateServiceImpl;
	
	@GetMapping("/cursos")
	public List<Candidate> listarCandidate(){
		return candidateServiceImpl.listarCandidates();
	}
	
	@PostMapping("/candidates")
	public Candidate salvarCandidate(@RequestBody Candidate candidate) {
		
		return candidateServiceImpl.guardarCandidate(candidate);
	}
	
}
