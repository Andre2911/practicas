package com.test.practicas.Service;

import java.util.List;
import java.util.Optional;

import com.test.practicas.Models.Clientes;
import com.test.practicas.Repository.ClientesRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientesServiceImpl implements ClientesImpl{

    @Autowired
    private ClientesRepository clientesService;


    @Override
    public Clientes findByDni(String dni) {
        Optional<Clientes> clienteOptional =  clientesService.findById(dni);
        return clienteOptional.orElse(null);
    }


    @Override
    public Clientes findByDniandEdad(String dni, String edad) {
        Optional<Clientes> clienteOptional =  clientesService.findById(dni);
        return clienteOptional.orElse(null);
    }


    @Override
    public Clientes testxd(String dni, String edad) {
        return clientesService.testxd(dni, edad);
    }
    
}
