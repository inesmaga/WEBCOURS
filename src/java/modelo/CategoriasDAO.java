/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


import entidades.Categorias;
import static entidades.Categorias_.id;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author inesm
 */
@Service
public class CategoriasDAO {
@PersistenceContext
private EntityManager em;

@Transactional(rollbackFor = {ServicioException.class})	
public void create(Categorias dto)throws ServicioException{
em.persist(dto);
}
//consulta simple Entity
    public Categorias readByid(Integer id) throws SecurityException{
        return em.find(Categorias.class,id);
    }
   //otra forma de query JPQL (Consulta simple)
    public Categorias readByNamJPQL(String nombre ) throws SecurityException{ 
	   
        String sql="Select c from Categorias c Where c.nombre = :nombre";

        Query q=em.createQuery(sql);
        q.setParameter("nombre",nombre);       
        
        try {
            return (Categorias)q.getSingleResult();
        } catch (Exception  e) {
            return null;
        }
    }
    
    //query JPQL (Consulta multiple)
    public List<Categorias> readAllJPQL() throws SecurityException{ 
        String sql="Select c from Categorias c";
        
        Query q=em.createQuery(sql);          
        return q.getResultList();
    }
    
  


    
    
}
