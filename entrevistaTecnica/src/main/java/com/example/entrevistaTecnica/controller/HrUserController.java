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

import com.example.entrevistaTecnica.dto.HrUser;
import com.example.entrevistaTecnica.service.HrUserServiceImpl;

/**
 * 
 * @author Eloi Martorell Martín
 *
 */

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
public class HrUserController {

	@Autowired
	HrUserServiceImpl hrUserServiceImpl;
	
	//listar
	@GetMapping("/hrUsers")
	public List<HrUser> listarHrUser()
	{
		return hrUserServiceImpl.listarHrUser();
	}
	
	//C
	@PostMapping("/hrUsers")
	public HrUser createHrUser(@RequestBody HrUser hrUser)
	{
		return hrUserServiceImpl.createHrUser(hrUser);
	}
	
	//R
	@GetMapping("/hrUsers/{id}")
	public HrUser readHrUser(@PathVariable(name="id") int id)
	{
		return hrUserServiceImpl.readHrUser(id);
	}
	
	//U
	@PutMapping("/hrUsers/{id}")
	public HrUser updateHrUser(@PathVariable(name="id") int id,@RequestBody HrUser hrUser)
	{
		
		HrUser hrUser_seleccionado = new HrUser();
		HrUser hrUser_actualizado = new HrUser();
		
		hrUser_seleccionado = hrUserServiceImpl.readHrUser(id);
		
		hrUser_seleccionado.setUsername(hrUser.getUsername());
		
		hrUser_actualizado = hrUserServiceImpl.updateHrUser(hrUser_seleccionado);
		
		return hrUser_actualizado;
	}
	
	//D
	@DeleteMapping("/hrUsers/{id}")
	public void deleteHrUser(@PathVariable(name="id") int id)
	{
		hrUserServiceImpl.deleteHrUser(id);
	}
	
}
