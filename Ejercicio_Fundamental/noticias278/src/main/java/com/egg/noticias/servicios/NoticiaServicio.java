
package com.egg.noticias.servicios;

import com.egg.noticias.entidades.Noticia;
import com.egg.noticias.repositorios.NoticiaRepositorio;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class NoticiaServicio {
    
    @Autowired
    NoticiaRepositorio notrepo; /* intanciamos el repositorio una sola vez */
    
    @Transactional
    public void CrearNoticia(String titulo, String Contenido){
        Noticia not = new Noticia();
        
        not.setTitulo(titulo);
        not.setContenido(Contenido);
        
        notrepo.save(not);
    }
    
  
    @Transactional
    public void EliminarNoticia(Long id){
          
        Noticia not = notrepo.findById(id).get();
 
        notrepo.delete(not);
    }  
    
}
