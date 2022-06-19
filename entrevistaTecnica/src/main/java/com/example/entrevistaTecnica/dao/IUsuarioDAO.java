package com.example.entrevistaTecnica.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entrevistaTecnica.dto.Usuario;

/**
 * 
 * @author Eloi Martorell Martín
 *
 */

public interface IUsuarioDAO extends JpaRepository<Usuario, Long> {
	Usuario findByUsername(String username);
}
