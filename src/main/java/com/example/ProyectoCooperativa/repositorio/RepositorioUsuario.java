package com.example.ProyectoCooperativa.repositorio;

import com.example.ProyectoCooperativa.entidades.Cliente;
import com.example.ProyectoCooperativa.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioUsuario extends JpaRepository<Usuario, String> {

    Usuario findByEmail(String email);
}


