package com.example.entrevistaTecnica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entrevistaTecnica.dao.IHrUserDAO;
import com.example.entrevistaTecnica.dto.HrUser;

/**
 * 
 * @author Eloi Martorell Martín
 *
 */

@Service
public class HrUserServiceImpl implements IHrUserService{

	@Autowired
	IHrUserDAO iHrUserDAO;
	
	@Override
	public List<HrUser> listarHrUser() 
	{
		return iHrUserDAO.findAll();
	}

	@Override
	public HrUser createHrUser(HrUser hrUser) 
	{
		return iHrUserDAO.save(hrUser);
	}

	@Override
	public HrUser readHrUser(int id) 
	{
		return iHrUserDAO.findById(id).get();
	}

	@Override
	public HrUser updateHrUser(HrUser hrUser) 
	{
		return iHrUserDAO.save(hrUser);
	}

	@Override
	public void deleteHrUser(int id) 
	{
		iHrUserDAO.deleteById(id);
	}
	
	

}
