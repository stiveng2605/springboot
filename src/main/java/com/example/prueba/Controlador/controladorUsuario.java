package com.example.demo.Controlador;

import com.example.demo.Entidades.Usuario;
import com.example.demo.Servicios.servicioUsuario;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class ControladorUsuario {
    servicioUsuario servicio=new servicioUsuario();

    @GetMapping("/listarUsuario")
    public ArrayList<Usuario> listar(){
        return servicio.listar();
    }

}
