
package egg.Noticias.servicios;

import egg.Noticias.entidades.Noticia;
import egg.Noticias.excepciones.NotiException;
import egg.Noticias.repositorios.NoticiaRepositorio;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class NoticiaServicio {
    
    @Autowired
    NoticiaRepositorio notrepo; /* intanciamos el repositorio una sola vez */
    
    @Transactional
    public void CrearNoticia(String titulo, String contenido) throws NotiException {
      
        if (titulo.isEmpty() || titulo == null) {
            throw new NotiException("El Titulo no puede estar vacio");
        }
        
        if (contenido.isEmpty() || contenido == null) {
            throw new NotiException("El Contenido no puede estar vacio");
        }
        
        
        Noticia not = new Noticia();
        
        not.setTitulo(titulo);
        not.setContenido(contenido);
        
        notrepo.save(not);
    }
    
  
    @Transactional
    public void EliminarNoticia(Long id){
       
        Noticia not = notrepo.findById(id).get(); /* Obtener el Libro a Eliminar por ID*/ 
       
        notrepo.delete(not);
    }  
    
      
    @Transactional
    public void ModificarTituloPorID(String titulo,Long id){
        
        Optional<Noticia> respuesta = notrepo.findById(id);
        
        if(respuesta.isPresent()){
            Noticia not = respuesta.get();
 
            not.setTitulo(titulo);
            
            notrepo.save(not);
        }
        
    }
    
    
    @Transactional
    public void ModificarContenidoPorID(String contenido,Long id){
        
        Optional<Noticia> respuesta = notrepo.findById(id);
        
        if(respuesta.isPresent()){
            Noticia not = respuesta.get();
            
            not.setContenido(contenido);
            
            notrepo.save(not);
        }
    }
}