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

	@GetMapping("/candidates")
	public List<Candidate> listarCandidate() {
		return candidateServiceImpl.listarCandidates();
	}

	@PostMapping("/candidates")
	public Candidate salvarCandidate(@RequestBody Candidate candidate) {

		return candidateServiceImpl.guardarCandidate(candidate);
	}

	@GetMapping("/candidates/{id}")
	public Candidate CandidateXID(@PathVariable(name = "id") int id) {

		Candidate Candidate_xid = new Candidate();

		Candidate_xid = candidateServiceImpl.candidateXID(id);

		return Candidate_xid;
	}

	@PutMapping("/candidates/{id}")
	public Candidate actualizarCandidate(@PathVariable(name = "id") int id, @RequestBody Candidate candidate) {

		Candidate Candidate_seleccionado = new Candidate();
		Candidate Candidate_actualizado = new Candidate();

		Candidate_seleccionado = candidateServiceImpl.candidateXID(id);

		Candidate_seleccionado.setCandidate_name(candidate.getCandidate_name());
		Candidate_seleccionado.setCandidate_surname(candidate.getCandidate_surname());

		Candidate_actualizado = candidateServiceImpl.actualizarCandidate(Candidate_seleccionado);

		return Candidate_actualizado;
	}

	@DeleteMapping("/registroCursos/{id}")
	public void eleiminarCandidate(@PathVariable(name = "id") int id) {
		candidateServiceImpl.eliminarCandidate(id);
	}

}
