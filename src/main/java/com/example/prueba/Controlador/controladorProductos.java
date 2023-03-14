package com.example.prueba.Controlador;

import com.example.prueba.Entidades.Productos;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.prueba.Servicios.servicioProductos;

import java.util.ArrayList;

@RestController
public class controladorProductos {
    servicioProductos servicio = new servicioProductos();

    @GetMapping("/listarProductos")
    public ArrayList<Productos> listar(){
        return servicio.mostrar();
    }

    @GetMapping("/cantidades")
    public int mostrar(){
        return servicio.cantidad();
    };

}
