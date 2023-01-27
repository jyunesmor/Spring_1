/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egg.Noticia.entidades;

/**
 *
 * @author Juan
 * 
 */
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Juan
 */
@Entity
public class Noticia implements Serializable {
    
    
    @Id 
    private Integer id; 
            
    private String titulo;
    private String cuerpo;
 
    
}

