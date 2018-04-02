/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import static entidades.Alumno_.nombre;
import entidades.Cursos;
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
public class CursosDAO {
@PersistenceContext
private EntityManager em;
@Transactional(rollbackFor = {ServicioException.class})	
public void create(Cursos dto)throws ServicioException{
em.persist(dto);
}
//consulta simple Entity
    public Cursos readByid(Integer id) throws SecurityException{
        return em.find(Cursos.class,id);
    }
   //otra forma de query JPQL (Consulta simple)
    public Cursos readByRutidJPQL(Integer id) throws SecurityException{ 
        String sql="Select cu from Cursos cu Where cu.id = :id";

        Query q=em.createQuery(sql);
        q.setParameter("id", id);       
        
        try {
            return (Cursos)q.getSingleResult();
        } catch (Exception  e) {
            return null;
        }
    }
   public Cursos readByNamJPQL(String nombre ) throws SecurityException{ 
        String sql="Select c from Cursos c Where c.nombre = :nombre";

        Query q=em.createQuery(sql);
        q.setParameter("nombre",nombre);       
        
        try {
            return (Cursos)q.getSingleResult();
        } catch (Exception  e) {
            return null;
        }
    }
    //query JPQL (Consulta multiple)
    public List<Cursos> readAllJPQL() throws SecurityException{ 
        String sql="Select cu from Cursos cu";
        
        Query q=em.createQuery(sql);          
        return q.getResultList();
    }


    
  


    
    
	
}
