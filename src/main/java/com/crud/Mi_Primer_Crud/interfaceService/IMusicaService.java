package com.crud.Mi_Primer_Crud.interfaceService;

import java.util.List;
import java.util.Optional;

import com.crud.Mi_Primer_Crud.modelo.Musica;

// Metodos del CRUD, seran usados mas adelante

public interface IMusicaService {

    public List<Musica> listar(); // READ (Consultar)
    public Optional<Musica>listarById(int id); // Buscar
    public int guardar(Musica musica); // CREATE
    public void delate(int id); 
}
