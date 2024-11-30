package com.crud.Mi_Primer_Crud.interfaceService;

import java.util.List;
import java.util.Optional;

import com.crud.Mi_Primer_Crud.modelo.Musica;

// Metodos del CRUD, seran usados mas adelante

public interface IMusicaService {

    public List<Musica> listar();
    public Optional<Musica>listarById(int id);
    public int guardar(Musica musica);
    public void delate(int id);
}
