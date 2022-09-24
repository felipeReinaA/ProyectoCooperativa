package com.example.ProyectoCooperativa.servicios;

import com.example.ProyectoCooperativa.entidades.Cliente;

import java.util.List;
import java.util.Map;

public interface ServicioCliente {

   public List<Cliente>listarClientes();
   public Cliente guardarClientes(Cliente cliente);
   public Cliente consultarClientesPorId(String documento);
   public Cliente actualizarClientes(Cliente cliente);
   //public void eliminarClientes(Integer documento);
   public void eliminarClientesId(String documento);
   public Cliente actualizarPorId(String doc);
   //public Cliente actualizarPorId(String doc, Map<Object,Object> objectMap);
}
