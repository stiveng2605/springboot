package com.example.prueba.Controlador;
import com.example.prueba.Entidades.Usuario;
import com.example.prueba.Servicios.servicioUsuario;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class controladorUsuario {
    servicioUsuario servicio= new servicioUsuario();

    @GetMapping("/listarUsuarios")
    public ArrayList<Usuario> listarUsuarios(){
        return servicio.listar();
    }
}
