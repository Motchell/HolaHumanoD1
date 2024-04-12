package com.newcompany.holahumano.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/buscar")
public class HolaHumanoController {
	
	@RequestMapping("")
    public String holaHumano(){
    	return "Hola humano";
    }
	
	@RequestMapping("/{nombre}")
    public String holaNombre(@PathVariable("nombre") String nombre){
    	return "Hola " + nombre;
    }

	@RequestMapping("/{nombre}/{apellido}")
    public String holaNombreApellido(@PathVariable("nombre") String nombre, @PathVariable("apellido") String apellido){
    	return "Hola " + nombre + " " + apellido;
    }
	
}

// http://localhost:8080/buscar 