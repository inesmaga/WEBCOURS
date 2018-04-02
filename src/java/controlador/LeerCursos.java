/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import entidades.Cursos;
import java.util.List;
import modelo.CursosDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author inesm
 */
@Controller
@RequestMapping("/vercur.htm")
public class LeerCursos {
@Autowired
	
 private CursosDAO dao;
@RequestMapping(method = RequestMethod.GET)
 public String mostrarCursos(Model model){
List<Cursos> cu = dao.readAllJPQL();

 if (cu == null) {
                return "error";
 }
 
 model.addAttribute("listaCursos",cu);
 return "index";
 
}    
   
}
