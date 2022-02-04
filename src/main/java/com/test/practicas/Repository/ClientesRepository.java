package com.test.practicas.Repository;

import com.test.practicas.Models.Clientes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ClientesRepository extends JpaRepository<Clientes, String> {

    @Query("FROM Clientes WHERE dni = :dni AND edad = :edad")
    Clientes testxd(@Param("dni") String dni, @Param("edad") String edad);


}



