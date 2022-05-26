package com.example.entrevistaTecnica.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entrevistaTecnica.dto.HrUser;

/**
 * 
 * @author Eloi Martorell Martín
 *
 */

public interface IHrUserDAO extends JpaRepository<HrUser, Integer>{

}
