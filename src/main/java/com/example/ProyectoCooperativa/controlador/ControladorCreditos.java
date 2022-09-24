package com.example.ProyectoCooperativa.controlador;

import com.example.ProyectoCooperativa.entidades.Creditos;
import com.example.ProyectoCooperativa.repositorio.RepositorioCliente;
import com.example.ProyectoCooperativa.servicios.ServicioImpCliente;
import com.example.ProyectoCooperativa.servicios.SrvicioImpCredito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RequestMapping("/api")
@RestController
public class ControladorCreditos {

    @Autowired
    private SrvicioImpCredito sic;


    @GetMapping
    public List<Creditos> listar(){

        return sic.listarCreditos();
    }


    @PostMapping("/prestamo/{documento}/creditosos")
    public Creditos insertar(@PathVariable String documento ,@Validated @RequestBody Creditos creditos) {

        return sic.guardarCredisto(documento,creditos);



    }

   /* @PostMapping
    public ResponseEntity <Creditos> guardarCredito( @RequestBody Creditos creditos){
        Creditos creditosGuardados=sic.guardarCredisto(creditos);
        UriComponentsBuilder ubicacion= ServletUriComponentsBuilder.fromCurrentRequest().path("/{id]")
                .buildAndExpand(creditosGuardados.getCodigo()).toUri();
        return  ResponseEntity.created(ubicacion).body(creditosGuardados);
    }*/
 /*  @PostMapping()
   public ResponseEntity<Creditos> saveDepartment(@RequestBody Creditos creditos) {
       var departmentSaved = sic.guardarCredisto(creditos);
       return new ResponseEntity<>(departmentSaved, HttpStatus.ACCEPTED);
   }*/



}