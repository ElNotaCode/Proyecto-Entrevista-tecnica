package com.example.entrevistaTecnica.service;

import java.util.List;

import com.example.entrevistaTecnica.dto.CandidatePosition;

/**
 * @author Borja
 *
 */

public interface ICandidatePositionService {

	// Metodos del CRUD
	
	// Listar ALL
	public List<CandidatePosition> listarCandidatePosition(); 
	
	// Create
	public CandidatePosition guardarCandidatePosition(CandidatePosition candidatePosition);	//Guarda un CandidatePosition CREATE
	
	// Read
	public CandidatePosition candidatePositionXID(int id); //Leer datos de un CandidatePosition READ
	
	// Update
	public CandidatePosition actualizarCandidatePosition(CandidatePosition candidatePosition); //Actualiza datos del CandidatePosition UPDATE
	
	// Delete
	public void eliminarCandidatePosition(int id);// Elimina el CandidatePosition DELETE

}