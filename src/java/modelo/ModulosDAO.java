/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import entidades.Modulos;
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

public class ModulosDAO {
@PersistenceContext
private EntityManager em;
@Transactional(rollbackFor = {ServicioException.class})	
public void create(Modulos dto)throws ServicioException{
em.persist(dto);
}
//consulta simple Entity
    public Modulos readByid(Integer id) throws SecurityException{
        return em.find(Modulos.class,id);
    }
   //otra forma de query JPQL (Consulta simple)
    public Modulos readByRutJPQL(Integer id) throws SecurityException{ 
        String sql="Select m from Modulos m Where m.id = :id";

        Query q=em.createQuery(sql);
        q.setParameter("id", id);       
        
        try {
            return (Modulos)q.getSingleResult();
        } catch (Exception  e) {
            return null;
        }
    }
 //query JPQL (Consulta multiple)
    public List<Modulos> readAllJPQL() throws SecurityException{ 
        String sql="Select m from Modulos m";
        
        Query q=em.createQuery(sql);          
        return q.getResultList();
    }
}
