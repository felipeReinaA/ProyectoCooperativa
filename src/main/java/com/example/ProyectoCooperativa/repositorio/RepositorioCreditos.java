package com.example.ProyectoCooperativa.repositorio;

import com.example.ProyectoCooperativa.entidades.Creditos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioCreditos extends JpaRepository<Creditos, Integer> {

}
