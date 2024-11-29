package com.crud.Mi_Primer_Crud.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crud.Mi_Primer_Crud.modelo.Musica;


// Esta interfaz en necesaria para poder usar los metodos de CrudRepository
// Se usa en MusicaService
@Repository
public interface IMusica extends CrudRepository<Musica, Integer> {
}
