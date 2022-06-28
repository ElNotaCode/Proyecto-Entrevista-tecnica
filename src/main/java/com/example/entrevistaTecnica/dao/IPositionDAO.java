package com.example.entrevistaTecnica.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entrevistaTecnica.dto.Position;

/**
 * @author Marc López
 *
 */
public interface IPositionDAO extends JpaRepository<Position, Integer>{

}
