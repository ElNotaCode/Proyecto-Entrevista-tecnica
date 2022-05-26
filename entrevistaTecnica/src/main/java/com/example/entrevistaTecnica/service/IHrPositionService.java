package com.example.entrevistaTecnica.service;

import java.util.List;

import com.example.entrevistaTecnica.dto.HrPosition;


/**
 * @author Marc López
 *
 */
public interface IHrPositionService {
	
	
	//Metodos del CRUD
			public List<HrPosition> listarHrPosition(); //Listar All 
			
			public HrPosition guardarHrPosition(HrPosition hrPosition);	//Guarda un HrPosition CREATE
			
			public HrPosition hrPositionXID(int id); //Leer datos de un HrPosition READ
			
			public HrPosition actualizarHrPosition(HrPosition hrPosition); //Actualiza datos del HrPosition UPDATE
			
			public void eliminarHrPosition(int id);// Elimina el HrPosition DELETE
		
	}

	
	

