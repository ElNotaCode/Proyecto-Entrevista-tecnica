package com.example.entrevistaTecnica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.entrevistaTecnica.dao.ICandidateDAO;
import com.example.entrevistaTecnica.dto.Candidate;

public class CandidateServiceImpl implements ICandidateService {

	@Autowired
	ICandidateDAO iCandidateDAO;
	
	@Override
	public List<Candidate> listarCandidates() {
		// TODO Auto-generated method stub
		return iCandidateDAO.findAll();
	}

	@Override
	public Candidate guardarCandidate(Candidate candidate) {
		// TODO Auto-generated method stub
		return iCandidateDAO.save(candidate);
	}

	@Override
	public Candidate candidateXID(int id) {
		// TODO Auto-generated method stub
		return iCandidateDAO.findById(id).get();
	}

	@Override
	public Candidate actualizarCandidate(Candidate candidate) {
		// TODO Auto-generated method stub
		return iCandidateDAO.save(candidate);
	}

	@Override
	public void eliminarCandidate(int id) {
		// TODO Auto-generated method stub
		iCandidateDAO.deleteById(id);
	}

}
