package com.crud.Mi_Primer_Crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crud.Mi_Primer_Crud.interfaceService.IMusicaService;
import com.crud.Mi_Primer_Crud.modelo.Musica;

@Controller
@RequestMapping
public class Controlador {

    @Autowired
    private IMusicaService service;

    @GetMapping("/listar") // Cuando se vaya a la URL se va a mostrar las musicas
    private String listar(Model model) {
        List<Musica> musicas = service.listar();
        model.addAttribute("musicas", musicas);
        return "index"; // hace referencia al archivo index.html
    }

}
