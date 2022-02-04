package com.test.practicas.Controllers;

import java.util.List;

import com.test.practicas.Models.Clientes;
import com.test.practicas.Repository.ClientesRepository;
import com.test.practicas.Service.ClientesServiceImpl;
import com.test.practicas.payload.request;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/")
public class ApiController {

    @Autowired
    private ClientesServiceImpl clientesService;

    @PostMapping("v1/{dni}")
    public Clientes test( @PathVariable("dni") String dni) {
        return clientesService.findByDni(dni);
    }

    @PostMapping("v2")
    public Clientes test_json(@RequestBody request request) {
        return clientesService.testxd(request.getDni(), request.getEdad());
    }
    
    
}
