package com.example.ProyectoCooperativa.servicios;

import com.example.ProyectoCooperativa.entidades.Cliente;
import com.example.ProyectoCooperativa.entidades.Usuario;
import com.example.ProyectoCooperativa.repositorio.RepositorioUsuario;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ServicioUsiario implements ServicioUsu {

    private RepositorioUsuario repositorioUsuario;

    public ServicioUsiario(RepositorioUsuario repositorioUsuario) {
        this.repositorioUsuario = repositorioUsuario;
    }

    @Override
    public Usuario guardarusuario(Usuario user) {
        return this.repositorioUsuario.save(user);
    }
    public  Usuario buscarporemail(String email){
        return  this.repositorioUsuario.findByEmail(email);
    }




    public Usuario obtenerusuario(Map<String, Object> userData) {
        String email = (String) userData.get("email");
        Usuario user = buscarporemail(email);
        if (user == null) {
            String name = (String) userData.get("nickname");
            String image = (String) userData.get("picture");
            String auth0Id = (String) userData.get("sub");
            Usuario userr = new Usuario(email = email, image = image, auth0Id = auth0Id);

            return guardarusuario(userr);
        }
        System.out.println(user.getEmail());
        return user;
    }






}
