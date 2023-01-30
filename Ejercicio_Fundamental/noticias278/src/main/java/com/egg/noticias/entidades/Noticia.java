
package com.egg.noticias.entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Noticia implements Serializable {
    
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
private Long id;
private String titulo;
private String contenido;

    public Noticia() {
    }

    public Noticia(String titulo, String contenido) {
        this.titulo = titulo;
        this.contenido = contenido;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    
    


}
