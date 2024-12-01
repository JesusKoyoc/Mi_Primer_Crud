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

    // Optional sirve para saber si HAY o NO HAY valar y no recibir valores NULOS
    @Override
    public Optional<Musica> listarById(int id) {
        return data.findById(id); // lista por id
    }

    @Override
    public int guardar(Musica m) {
        int resp=0;
        Musica musica = data.save(m);

        // Validar
        if(!musica.equals(null)) {
            resp=1;
        }
        
        return resp;
    }

    @Override
    public void delate(int id) {
        data.deleteById(id);;

    }
}
