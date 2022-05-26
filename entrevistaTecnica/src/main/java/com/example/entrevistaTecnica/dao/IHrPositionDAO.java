package com.example.entrevistaTecnica.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entrevistaTecnica.dto.HrPosition;

/**
 * @author Marc López
 *
 */

public interface IHrPositionDAO extends JpaRepository<HrPosition, Integer> {

}
