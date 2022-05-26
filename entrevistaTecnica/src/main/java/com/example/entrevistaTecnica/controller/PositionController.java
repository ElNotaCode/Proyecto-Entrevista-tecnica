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

import com.example.entrevistaTecnica.dto.Position;
import com.example.entrevistaTecnica.service.PositionServiceImpl;
/**
 * @author Marc López
 * @reviewed Eloy Martorell
 */


@RestController
@RequestMapping("/api")

public class PositionController {
	
	@Autowired
	PositionServiceImpl positionServiceImpl;
	
	@GetMapping("/positions")
	public List<Position> listarPosition(){
		return positionServiceImpl.listarPositions();
	}
	
	
	@PostMapping("/positions")
	public Position salvarPosition(@RequestBody Position position) {
		
		return positionServiceImpl.guardarPosition(position);
	}
	
	
	@GetMapping("/positions/{id}")
	public Position positionXID(@PathVariable(name="id") int id) {
		
		Position Position_xid= new Position();
		
		Position_xid=positionServiceImpl.positionXID(id);
		
		return Position_xid;
	}
	
	@PutMapping("/positions/{id}")
	public Position actualizarPosition(@PathVariable(name="id")int id,@RequestBody Position position) {
		
		Position Position_seleccionado= new Position();
		Position Position_actualizado= new Position();
		
		Position_seleccionado= positionServiceImpl.positionXID(id);
		
		Position_seleccionado.setTitle(position.getTitle());
		Position_seleccionado.setDescription(position.getDescription());
		
		Position_actualizado = positionServiceImpl.actualizarPosition(Position_seleccionado);
		
		return Position_actualizado;
	}
	
	@DeleteMapping("/positions/{id}")
	public void eleiminarPosition(@PathVariable(name="id")int id) {
		positionServiceImpl.eliminarPosition(id);
	}

}
