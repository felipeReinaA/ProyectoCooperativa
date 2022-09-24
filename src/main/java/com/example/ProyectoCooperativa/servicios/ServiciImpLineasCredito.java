package com.example.ProyectoCooperativa.servicios;

import com.example.ProyectoCooperativa.entidades.Cliente;
import com.example.ProyectoCooperativa.entidades.LineasDeCredito;
import com.example.ProyectoCooperativa.repositorio.RepositorioLineasCredito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class ServiciImpLineasCredito implements  ServicioLineasCredito{
    @Autowired
    private RepositorioLineasCredito rlc;

    @Override
    public List<LineasDeCredito> listarLineasCredito() {
        return rlc.findAll();
    }

    @Override
    public LineasDeCredito guardarLineasCredito(LineasDeCredito lc) {
        return rlc.save(lc);
    }


    @Override
    public LineasDeCredito consultaLineasCredito(Integer documento) {
        return rlc.findById(documento).get();
    }






}
