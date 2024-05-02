package com.sistema.examenes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistema.examenes.repositories.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario,Long>{

    Usuario findByUsername(String username);
    
}
