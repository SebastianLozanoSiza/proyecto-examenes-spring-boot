package com.sistema.examenes.services;

import java.util.Set;

import com.sistema.examenes.repositories.entities.Usuario;
import com.sistema.examenes.repositories.entities.UsuarioRol;

public interface UsuarioService {
    
    Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuarioRoles) throws Exception;

    Usuario obtenerUsuario(String username);

    void eliminarUsuario(Long usuarioId);
}
