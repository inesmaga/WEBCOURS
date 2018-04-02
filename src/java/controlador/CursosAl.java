/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import entidades.Alumno;
import modelo.AlumnoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author inesm
 */
@Controller
@RequestMapping("/verCurAl.htm")
public class CursosAl {
@Autowired	
private AlumnoDAO dao;	
@RequestMapping(method = RequestMethod.POST)    
    public String CursosAl(
	    
            @RequestParam("Alcur") String nombre,
            Model model){
        
            if (nombre.trim().equals("")) {
                return "index";
            }
            
            Alumno a = dao.readByNamJPQL(nombre);    
            
            if (a == null) {
		 return "index";    
            }
            
            model.addAttribute("listaCurA", a.getCursosCollection());
           
            return "BusqCurAlum";  
    }
	
	
	
	
	
}
