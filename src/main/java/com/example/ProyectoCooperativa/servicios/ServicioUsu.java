package com.example.ProyectoCooperativa.servicios;

import com.example.ProyectoCooperativa.entidades.Cliente;
import com.example.ProyectoCooperativa.entidades.LineasDeCredito;
import com.example.ProyectoCooperativa.entidades.Usuario;

import java.util.Map;

public interface ServicioUsu {



    public Usuario obtenerusuario(Map<String,Object> userData);

    public Usuario guardarusuario(Usuario user);




}
