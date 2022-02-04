package com.test.practicas.Models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clientes")
public class Clientes {

    @Id
    private String dni;
    private String apellido_paterno;
    private String apellido_materno;
    private String nombres;
    private String edad;

    public Clientes() {
    }

    public Clientes (String dni, String apellido_paterno, String apellido_materno, String nombres, String edad) {
        this.dni = dni;
        this.apellido_paterno = apellido_paterno;
        this.apellido_materno = apellido_materno;
        this.nombres = nombres;
        this.edad = edad;
    }
    public String getDni() {
        return dni;
    }
    

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getApellido_paterno() {
        return apellido_paterno;
    }

    public void setApellido_paterno(String apellido_paterno) {
        this.apellido_paterno = apellido_paterno;
    }

    public String getApellido_materno() {
        return apellido_materno;
    }

    public void setApellido_materno(String apellido_materno) {
        this.apellido_materno = apellido_materno;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
    
}
