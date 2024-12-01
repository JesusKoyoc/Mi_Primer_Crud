package com.crud.Mi_Primer_Crud.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crud.Mi_Primer_Crud.interfaceService.IMusicaService;
import com.crud.Mi_Primer_Crud.modelo.Musica;

@Controller
@RequestMapping
public class Controlador {

    @Autowired
    private IMusicaService service;

    // Metodo GET (Obetner los datos)
    @GetMapping("/listar") // Cuando se vaya a la URL se va a mostrar las musicas
    private String listar(Model model) {
        List<Musica> musicas = service.listar();
        model.addAttribute("musicas", musicas);
        return "index"; // hace referencia al archivo index.html
    }

    // Metodo POT (Agregar los datos)
    @GetMapping("/new")
    public String agregar(Model model) {
        model.addAttribute("musica", new Musica());
        return "form";
    }

    @PostMapping("/save")
    public String save(@Validated Musica musica, Model model) {
        // Guardar en la base de datos
        service.guardar(musica); // guarda los datos 
        return "redirect:/listar";
    }


    // Metodo UPDATE (Actualizar los datos)
    @GetMapping("/editar/{id_musica}" )
    public String editar(@PathVariable("id_musica") int id, Model model) {
        Optional<Musica> musica=service.listarById(id);

        if(musica.isPresent()) {
            model.addAttribute("musica", musica.get());
        } else {
            return "redirect:/listar";
        }
        return "form";
    }


    // Metodo DELATE (Eliminar los datos)
    @GetMapping("/eliminar/{id_musica}")
    public String eliminar(Model model, @PathVariable("id_musica") int id) {
        service.delate(id);
        return "redirect:/listar"; // redirecciona a pestaña listar
    }
}
