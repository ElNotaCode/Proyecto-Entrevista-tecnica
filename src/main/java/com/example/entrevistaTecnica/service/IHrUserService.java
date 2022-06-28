package com.example.entrevistaTecnica.service;

import java.util.List;

import com.example.entrevistaTecnica.dto.HrUser;

/**
 * 
 * @author Eloi Martorell Martín
 *
 */

public interface IHrUserService {

	//Listar
	public List<HrUser> listarHrUser();
	//C
	public HrUser createHrUser(HrUser hrUser);
	//R
	public HrUser readHrUser(int id);
	//U
	public HrUser updateHrUser(HrUser hrUser);
	//D
	public void deleteHrUser(int id);
	
}
