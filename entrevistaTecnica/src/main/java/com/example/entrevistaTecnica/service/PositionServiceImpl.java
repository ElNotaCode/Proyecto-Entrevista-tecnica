package com.example.entrevistaTecnica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entrevistaTecnica.dao.IPositionDAO;
import com.example.entrevistaTecnica.dto.Position;


@Service
public class PositionServiceImpl implements IPositionService{
	
	
	@Autowired
	IPositionDAO iPositionDAO;

	@Override
	public List<Position> listarPositions() {
		// TODO Auto-generated method stub
		return iPositionDAO.findAll();
	}

	@Override
	public Position guardarPosition(Position position) {
		// TODO Auto-generated method stub
		return iPositionDAO.save(position);
	}

	@Override
	public Position positionXID(int id) {
		// TODO Auto-generated method stub
		return iPositionDAO.findById(id).get();
	}

	@Override
	public Position actualizarPosition(Position position) {
		// TODO Auto-generated method stub
		return iPositionDAO.save(position);
	}

	@Override
	public void eliminarPosition(int id) {
		// TODO Auto-generated method stub
		iPositionDAO.deleteById(id);

		
	}

}
