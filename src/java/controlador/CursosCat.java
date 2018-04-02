/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import entidades.Categorias;
import entidades.Cursos;
import java.util.List;

import modelo.CategoriasDAO;
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
@RequestMapping("/verCurCat.htm")
public class CursosCat {
@Autowired
private CategoriasDAO dao;



 @RequestMapping(method = RequestMethod.POST)    
    public String CursosCat(
	    
            @RequestParam("Cursos") String nombre,
            Model model){
        
            if (nombre.trim().equals("")) {
                return "index";
            }
            
            Categorias c = dao.readByNamJPQL(nombre);    
            
            if (c == null) {
		 return "index";    
            }
            
            model.addAttribute("listaCurs", c.getCursosCollection());
           
            return "BusquedaCursos";  
    }

}
