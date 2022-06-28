package com.example.entrevistaTecnica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.entrevistaTecnica.dto.HrPosition;
import com.example.entrevistaTecnica.service.HrPositionServiceImpl;




/**
 * @author Marc López
 * @reviewed Eloy Martorell
 */

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
public class HrPositionController {
	@Autowired
	HrPositionServiceImpl hrPositionServiceImpl;
	
	@GetMapping("/hrPosition")
	public List<HrPosition> listarHrPosition(){
		return hrPositionServiceImpl.listarHrPosition();
	}
	
	
	@PostMapping("/hrPosition")
	public HrPosition salvarHrPosition(@RequestBody HrPosition hrPosition) {
		
		return hrPositionServiceImpl.guardarHrPosition(hrPosition);
	}
	
	
	@GetMapping("/hrPosition/{id}")
	public HrPosition hrPositionXID(@PathVariable(name="id") int id) {
		
		HrPosition HrPosition_xid= new HrPosition();
		
		HrPosition_xid=hrPositionServiceImpl.hrPositionXID(id);
		
		return HrPosition_xid;
	}
	
	@PutMapping("/hrPosition/{id}")
	public HrPosition actualizarHrPosition(@PathVariable(name="id")int id,@RequestBody HrPosition hrPosition) {
		
		HrPosition HrPosition_seleccionado= new HrPosition();
		HrPosition HrPosition_actualizado= new HrPosition();
		
		HrPosition_seleccionado= hrPositionServiceImpl.hrPositionXID(id);
		
		HrPosition_seleccionado.setId(hrPosition.getId());
		HrPosition_seleccionado.setFk_id_user(hrPosition.getFk_id_user());
		HrPosition_seleccionado.setFk_id_position(hrPosition.getFk_id_position());

		
		HrPosition_actualizado = hrPositionServiceImpl.actualizarHrPosition(HrPosition_seleccionado);
		
		return HrPosition_actualizado;
	}
	
	@DeleteMapping("/hrPosition/{id}")
	public void eleiminarCurso(@PathVariable(name="id")int id) {
		hrPositionServiceImpl.eliminarHrPosition(id);
	}
	
	
}
