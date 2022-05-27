package com.example.entrevistaTecnica.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Marc López
 * @reviewed Eloy Martorell
 */

@Entity
@Table(name="hr_position")//en caso que la tabala sea diferente
public class HrPosition {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	@Column(name = "ID_HR_POSITION")//no hace falta si se llama igual
	private int id;
	
	
	@ManyToOne
    @JoinColumn(name = "FK_ID_USER")
    HrUser fk_id_user;
 
    @ManyToOne
    @JoinColumn(name = "FK_ID_POSITION")
    Position fk_id_position;
    
    
	public HrPosition() {
		super();
		
	}

	public HrPosition(int id, HrUser fk_id_user, Position fk_id_position) {
		super();
		this.id = id;
		this.fk_id_user = fk_id_user;
		this.fk_id_position = fk_id_position;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public HrUser getFk_id_user() {
		return fk_id_user;
	}

	public void setFk_id_user(HrUser fk_id_user) {
		this.fk_id_user = fk_id_user;
	}

	public Position getFk_id_position() {
		return fk_id_position;
	}

	public void setFk_id_position(Position fk_id_position) {
		this.fk_id_position = fk_id_position;
	}

	@Override
	public String toString() {
		return "HrPosition [id=" + id + ", fk_id_user=" + fk_id_user + ", fk_id_position=" + fk_id_position + "]";
	}
	

}
