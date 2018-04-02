/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import entidades.Cursos;
import entidades.Modulos;
import modelo.CursosDAO;
import modelo.ModulosDAO;
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
@RequestMapping("/verModCur.htm")
public class ModulosCur {
@Autowired
private CursosDAO dao;	
 @RequestMapping(method = RequestMethod.POST)    
    public String ModulosCur(
            @RequestParam("modulos") String nombre,
            Model model){
        
                  
            Cursos c = dao.readByNamJPQL(nombre);    
            
            if (c == null) {
		 return "index";    
            }
            
            model.addAttribute("listaMods", c.getModulosCollection());
            
            return "BuscaModul";  
    }	
	
	
	
	
}
