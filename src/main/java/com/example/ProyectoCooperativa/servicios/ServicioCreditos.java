package com.example.ProyectoCooperativa.servicios;

import com.example.ProyectoCooperativa.entidades.Cliente;
import com.example.ProyectoCooperativa.entidades.Creditos;

import java.util.List;

public interface ServicioCreditos {


    public List<Creditos> listarCreditos();
    public Creditos guardarCredisto(String documento,Creditos creditos);
}
