/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import entidades.Tutores;
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
public class TutorDAO {
@PersistenceContext 
private EntityManager em;
@Transactional(rollbackFor = {ServicioException.class})	
public void create(Tutores dto)throws ServicioException{
em.persist(dto);
}
//query JPQL (Consulta multiple)
    public List<Tutores> readAllJPQL() throws SecurityException{ 
        String sql="Select tu from Tutores tu";
        
        Query q=em.createQuery(sql);          
        return q.getResultList();
    }
}
