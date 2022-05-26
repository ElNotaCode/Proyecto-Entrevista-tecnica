package dao;

import org.springframework.data.jpa.repository.JpaRepository;

import dto.HrUser;

/**
 * 
 * @author Eloi Martorell Martín
 *
 */

public interface IHrUserDAO extends JpaRepository<HrUser, Integer>{

}
