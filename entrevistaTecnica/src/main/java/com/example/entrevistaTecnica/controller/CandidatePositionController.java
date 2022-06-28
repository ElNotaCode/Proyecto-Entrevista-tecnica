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

import com.example.entrevistaTecnica.dto.CandidatePosition;
import com.example.entrevistaTecnica.service.CandidatePositionServiceImpl;

/**
 * @author Borja
 * @reviewed Eloy Martorell
 */

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
public class CandidatePositionController {

	@Autowired
	CandidatePositionServiceImpl candidatePositionServiceImpl;

	@GetMapping("/candidatePosition")
	public List<CandidatePosition> listarCandidatePosition() {
		return candidatePositionServiceImpl.listarCandidatePosition();
	}

	@PostMapping("/candidatePosition")
	public CandidatePosition salvarCandidatePosition(@RequestBody CandidatePosition candidatePosition) {

		return candidatePositionServiceImpl.guardarCandidatePosition(candidatePosition);
	}

	@GetMapping("/candidatePosition/{id}")
	public CandidatePosition CandidatePositionXID(@PathVariable(name = "id") int id) {

		CandidatePosition CandidatePosition_xid = new CandidatePosition();

		CandidatePosition_xid = candidatePositionServiceImpl.candidatePositionXID(id);

		// System.out.println("CandidatePosition XID: " + CandidatePosition_xid);

		return CandidatePosition_xid;
	}

	@PutMapping("/candidatePositions/{id}")
	public CandidatePosition actualizarCandidatePosition(@PathVariable(name = "id") int id,
			@RequestBody CandidatePosition CandidatePosition) {

		CandidatePosition CandidatePosition_seleccionado = new CandidatePosition();
		CandidatePosition CandidatePosition_actualizado = new CandidatePosition();

		CandidatePosition_seleccionado = candidatePositionServiceImpl.candidatePositionXID(id);

		CandidatePosition_seleccionado.setRegistryDate(CandidatePosition.getRegistryDate());
		CandidatePosition_seleccionado.setTestDate(CandidatePosition.getTestDate());
		CandidatePosition_seleccionado.setCompletionDate(CandidatePosition.getCompletionDate());
		CandidatePosition_seleccionado.setResult(CandidatePosition.getResult());

		CandidatePosition_actualizado = candidatePositionServiceImpl.actualizarCandidatePosition(CandidatePosition_seleccionado);

		return CandidatePosition_actualizado;
	}

	@DeleteMapping("/candidatePosition/{id}")
	public void eleiminarCandidatePosition(@PathVariable(name = "id") int id) {
		candidatePositionServiceImpl.eliminarCandidatePosition(id);
	}

}
