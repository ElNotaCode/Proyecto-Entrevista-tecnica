package com.example.entrevistaTecnica.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 
 * @author Eloi Martorell Martín
 * @reviewed Marc Lopez
 *
 */
@Entity
@Table(name="hr_user")
public class HrUser {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_USER")
	private int id_user;
	
	
	@Column(name="USERNAME")
	private String username;
	
	@OneToMany
	@JoinColumn(name="ID_USER")
	private List<HrPosition> hrPosition;
	
	//Constructors.
	
	public HrUser() 
	{
		
	}

	public HrUser(int id_user, String username, List<HrPosition> hrPosition) 
	{
		this.id_user = id_user;
		this.username = username;
		this.hrPosition = hrPosition;
	}
	
	/*
	 * Getters & Setters.
	 */

	/**
	 * 
	 * @return int id_user
	 */
	public int getId_user() 
	{
		return id_user;
	}

	/**
	 * 
	 * @param id_user
	 */
	public void setId_user(int id_user) 
	{
		this.id_user = id_user;
	}

	/**
	 * 
	 * @return String username
	 */
	public String getUsername() 
	{
		return username;
	}

	/**
	 * 
	 * @param username
	 */
	public void setUsername(String username) 
	{
		this.username = username;
	}

	/**
	 * 
	 * @return List<HrPosition> hrPosition
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "HrUser")
	public List<HrPosition> getHrPosition() 
	{
		return hrPosition;
	}

	/**
	 * 
	 * @param hrPosition
	 */
	public void setHrPosition(List<HrPosition> hrPosition) 
	{
		this.hrPosition = hrPosition;
	}
	
	

}
