package com.example.entrevistaTecnica.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entrevistaTecnica.dto.CandidatePosition;

/**
 * @author Borja
 *
 */

public interface ICandidatePositionDAO extends JpaRepository<CandidatePosition, Integer>{

}
