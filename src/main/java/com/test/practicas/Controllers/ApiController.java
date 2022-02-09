package com.test.practicas.Controllers;

import java.util.List;


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



    @PostMapping("v1/{dni}")
    public String test( @PathVariable("dni") String dni) {
        return "clientesService.findByDni(dni)";
    }

    
}
