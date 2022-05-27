package com.example.entrevistaTecnica.service;

import java.util.List;

import com.example.entrevistaTecnica.dto.Candidate;

/**
 * @author Borja
 * @reviewed Eloy Martorell
 */

public interface ICandidateService {

	//Metodos del CRUD
	public List<Candidate> listarCandidates(); //Listar All 
	
	public Candidate guardarCandidate(Candidate candidate);	//Guarda un Candidate CREATE
	
	public Candidate candidateXID(int id); //Leer datos de un Candidate READ
	
	public Candidate actualizarCandidate(Candidate candidate); //Actualiza datos del Candidate UPDATE
	
	public void eliminarCandidate(int id);// Elimina el Candidate DELETE

	
}
