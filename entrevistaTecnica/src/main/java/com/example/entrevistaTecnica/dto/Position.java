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
 * @author Marc López
 * @reviewed Eloy Martorell
 */



@Entity
@Table(name="position_table")
public class Position {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	@Column(name = "ID_POSITION")
	private int id;

	
	@Column(name = "TITLE")
	private String title;
	
	
	@Column(name = "DESCRIPTION")
	private String description;
	
	
	
	
	@OneToMany
    @JoinColumn(name="id")
    private List<HrPosition> hrPosition;
   
    
    
    
    
    

	public Position() {
		super();
		
	}

							
	public Position(int id, String title, String description,List<HrPosition> hrPosition) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.hrPosition = hrPosition;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}


	
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "HrPosition")
	public List<HrPosition> getHrPosition() {
		return hrPosition;
	}



	public void setHr_Position(List<HrPosition> hrPosition) {
		this.hrPosition = hrPosition;
	}

 
	@Override
	public String toString() {
		return "Position [id=" + id + ", title=" + title + ", description=" + description + "]";
	}
	
	
	
    
    
	
	
	
	
}
