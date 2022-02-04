package com.test.practicas.Service;


import com.test.practicas.Models.Clientes;

public interface ClientesImpl {

    Clientes findByDni(String dni);

    Clientes findByDniandEdad(String dni, String edad);

    Clientes testxd(String dni, String edad);
    
}
