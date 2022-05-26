package com.example.entrevistaTecnica.service;

import java.util.List;

import com.example.entrevistaTecnica.dto.Position;

/**
 * @author Marc López
 *
 */
public interface IPositionService {
	
	
	//Metodos del CRUD
			public List<Position> listarPositions(); //Listar All 
			
			public Position guardarPosition(Position position);	//Guarda un Position CREATE
			
			public Position positionXID(int id); //Leer datos de un Position READ
			
			public Position actualizarPosition(Position position); //Actualiza datos del Position UPDATE
			
			public void eliminarPosition(int id);// Elimina el Position DELETE

}
