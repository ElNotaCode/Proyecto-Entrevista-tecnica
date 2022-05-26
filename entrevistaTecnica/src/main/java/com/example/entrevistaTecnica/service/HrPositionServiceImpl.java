package com.example.entrevistaTecnica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entrevistaTecnica.dao.IHrPositionDAO;
import com.example.entrevistaTecnica.dto.HrPosition;



/**
 * @author Marc López
 *
 */

@Service
public class HrPositionServiceImpl implements  IHrPositionService{
	
	
	@Autowired
	IHrPositionDAO iHrPositionDAO;

	@Override
	public List<HrPosition> listarHrPosition() {
		// TODO Auto-generated method stub
		return iHrPositionDAO.findAll();
	}

	@Override
	public HrPosition guardarHrPosition(HrPosition hrPosition) {
		// TODO Auto-generated method stub
		return iHrPositionDAO.save(hrPosition);
	}

	@Override
	public HrPosition hrPositionXID(int id) {
		// TODO Auto-generated method stub
		return iHrPositionDAO.findById(id).get();
	}

	@Override
	public HrPosition actualizarHrPosition(HrPosition hrPosition) {
		// TODO Auto-generated method stub
		return iHrPositionDAO.save(hrPosition);
	}

	@Override
	public void eliminarHrPosition(int id) {
		iHrPositionDAO.deleteById(id);
		
	}

	



}
