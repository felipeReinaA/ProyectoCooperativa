package com.example.ProyectoCooperativa.repositorio;

import com.example.ProyectoCooperativa.entidades.Cliente;
import com.example.ProyectoCooperativa.entidades.LineasDeCredito;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioLineasCredito extends JpaRepository<LineasDeCredito, Integer> {



}
