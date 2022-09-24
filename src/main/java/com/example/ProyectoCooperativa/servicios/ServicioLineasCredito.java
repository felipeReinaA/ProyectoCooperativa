package com.example.ProyectoCooperativa.servicios;

import com.example.ProyectoCooperativa.entidades.Cliente;
import com.example.ProyectoCooperativa.entidades.LineasDeCredito;

import java.util.List;
import java.util.Map;

public interface ServicioLineasCredito {

    public List<LineasDeCredito> listarLineasCredito();
    public LineasDeCredito guardarLineasCredito(LineasDeCredito lc);
    public LineasDeCredito consultaLineasCredito(Integer documento);




}

