package com.example.ProyectoCooperativa.controlador;

import com.example.ProyectoCooperativa.entidades.Cliente;
import com.example.ProyectoCooperativa.entidades.Usuario;
import com.example.ProyectoCooperativa.servicios.ServicioCliente;
import com.example.ProyectoCooperativa.servicios.ServicioImpCliente;
import com.example.ProyectoCooperativa.servicios.ServicioUsu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

//@RequestMapping("/cliente")
//@RestController
@Controller
public class ControladorCliente {

    @Autowired
    private ServicioImpCliente servivoUsuario;
    @Autowired
    private ServicioImpCliente sic;

    public ControladorCliente(ServivoUsuario servivoUsuario){
        this.servivoUsuario = servivoUsuario;
    }

    @GetMapping("/")
    public String inicio(Model model, @AuthenticationPrincipal OidcUser principal) {
        if(principal!=null) {
            Usuario usuario=this.servivoUsuario.obtenerUsuario(principal.getClaims());
            System.out.println(principal.getClaims());
            model.addAttribute("usuario",usuario);
        }
        return "index";
    }

    @GetMapping("/cliente")
    public String listar(Model modelo) {
        modelo.addAttribute("clientes", sic.listarClientes());
        return ("tablaCliente");
    }

    @GetMapping("/cliente/nuevo")
    public String fotmularioregistro(Model modelo) {
        modelo.addAttribute("clienteinsertar", new Cliente());
        return "frmcliente";
    }

    @PostMapping("cliente/guardar")
    public String insertar(Cliente cli) {
        sic.guardarClientes(cli);
        return "redirect:/cliente";
    }

    @GetMapping("cliente/actualizar/{dato}")
    public String formularioActualizar(@PathVariable("dato") String dato, Model modelo) {
        Cliente cliente = sic.consultarClientesPorId(dato);
        modelo.addAttribute("clienteactualizar", cliente);
        return "frmactualizar";
    }

    @PostMapping("cliente/actualizar")
    public String actualizar(Cliente cli) {
        sic.actualizarClientes(cli);
        return "redirect:/cliente";
    }

    @GetMapping("cliente/eliminar/{id}")
    public String eliminarporId(@PathVariable("id") String id) {
        sic.eliminarClientesId(id);
        return ("redirect:/cliente");
    }

}

