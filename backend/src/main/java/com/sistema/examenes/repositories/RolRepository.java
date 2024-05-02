package com.sistema.examenes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistema.examenes.repositories.entities.Rol;

public interface RolRepository extends JpaRepository<Rol, Long>{
    
}
