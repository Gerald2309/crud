package com.gerald.demo.service;

import com.gerald.demo.entity.Cliente;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteService {

    //Listado cliente
    private List<Cliente> clientes;

    public ClienteService(){
        clientes = new ArrayList<>();
        clientes.add(new Cliente(1, "Geraldine", "Echeverri Ayala", "1025646047"));
        clientes.add(new Cliente(2, "Daniel", "Naranjo Benavides", "1106332354"));
        clientes.add(new Cliente(3, "Sandra", "Ayala Betancur", "43997444"));

    }

    public List<Cliente> list() {
        return clientes;
    }

    //Buscar cliente

    public Cliente find(int id) {
        for(Cliente cliente : clientes) {
            if (cliente.getId() == id ) {
                return cliente;
            }
        }
        return null;
    }

    //Crear cliente
    public Cliente save(Cliente cli){
        clientes.add(cli);
        return cli;

    }

    //Editar cliente
    public Cliente update(int id, Cliente cli){
        int index = 0;
        for (Cliente I: clientes){
            if(I.getId() == id) {
                cli.setId(id);
                clientes.set(index,cli);
            }
        }
        return cli;
    }

    //Eliminar

    public boolean delete(int id){
        for(Cliente c : clientes) {
            if(c.getId() == id) {
                return clientes.remove(c);
            }
        }
        return false;
    }
















































}
