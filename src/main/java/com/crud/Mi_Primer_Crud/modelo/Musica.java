package com.crud.Mi_Primer_Crud.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// Clase Musica tendra las variables que seran usadas para la base de datos

// id_musica
// nombre_cancion
// artista
// genero_Cancion
// duracion_cancion

// Anotacion necesarias para spring-boot

@Entity
@Table(name = "musica") // Sirve para crar la tabla con el nombre Musica en la base de datos
public class Musica {

    // Anotaciones para el Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Hace refernacia que el atributo id_musica, sera el id en la tabla Musica
    private int id_musica;
    private String nombre_cancion;
    private String artista;
    private String duracion_cancion;
    private String genero_cancion;

    // Constructor nulo
    public Musica() {
    }

    // Constructor no nulo
    public Musica(int id_musica, String nombre_cancion, String artista, String duracion_cancion,
            String genero_cancion) {
        this.id_musica = id_musica;
        this.nombre_cancion = nombre_cancion;
        this.artista = artista;
        this.duracion_cancion = duracion_cancion;
        this.genero_cancion = genero_cancion;
    }

    // Metodo getter y setter de los atributos
    public int getId_musica() {
        return id_musica;
    }

    public void setId_musica(int id_musica) {
        this.id_musica = id_musica;
    }

    public String getNombre_cancion() {
        return nombre_cancion;
    }

    public void setNombre_cancion(String nombre_cancion) {
        this.nombre_cancion = nombre_cancion;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getDuracion_cancion() {
        return duracion_cancion;
    }

    public void setDuracion_cancion(String duracion_cancion) {
        this.duracion_cancion = duracion_cancion;
    }

    public String getGenero_cancion() {
        return genero_cancion;
    }

    public void setGenero_cancion(String genero_cancion) {
        this.genero_cancion = genero_cancion;
    }
    
    
    

    

}
