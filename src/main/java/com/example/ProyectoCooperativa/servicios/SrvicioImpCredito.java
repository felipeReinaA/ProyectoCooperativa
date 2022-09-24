package com.example.ProyectoCooperativa.servicios;

import com.example.ProyectoCooperativa.entidades.Cliente;
import com.example.ProyectoCooperativa.entidades.Creditos;
import com.example.ProyectoCooperativa.repositorio.RepositorioCliente;
import com.example.ProyectoCooperativa.repositorio.RepositorioCreditos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.*;
import java.util.List;


@Service
public class SrvicioImpCredito {
    @Autowired
    private RepositorioCreditos rc;

    @Autowired
    private RepositorioCliente rcli;

    public SrvicioImpCredito(RepositorioCreditos rc, RepositorioCliente rcli) {
        this.rc = rc;
        this.rcli = rcli;
    }


    public List<Creditos> listarCreditos() {
        return rc.findAll();
    }




    public Creditos guardarCredisto(String documento, Creditos creditos) {

        return rcli.findById(documento)
                .map(cliente->{
                    creditos.setCliente(cliente);
                    return  rc.save(creditos);

                }).get();
    }
}
