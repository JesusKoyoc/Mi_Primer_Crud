package com.crud.Mi_Primer_Crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.Mi_Primer_Crud.interfaceService.IMusicaService;
import com.crud.Mi_Primer_Crud.interfaces.IMusica;
import com.crud.Mi_Primer_Crud.modelo.Musica;

// Aqui se implementan los metodos de la interfaz IMusicaService
@Service
public class MusicaService implements IMusicaService{

    // Para poder implemetar los metodos de IMusicaService, necesitamos una varible de la clase IMusica
    @Autowired
    private IMusica data;



    @Override
    public List<Musica> listar() {
        // la variable data, se tiene que castear
        return (List<Musica>)data.findAll(); // findAll viene de CrudRepository. Retorna una lista de musica
    }

    @Override
    public Optional<Musica> listarById(int id) {
        return null;
    }

    @Override
    public int save(Musica musica) {
        return 0;
    }

    @Override
    public void delate(int id) {
        return ;
    }

}
