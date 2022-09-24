package com.example.ProyectoCooperativa.repositorio;

import com.example.ProyectoCooperativa.entidades.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface RepositorioCliente extends JpaRepository<Cliente, String> {
}
