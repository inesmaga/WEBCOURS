/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import entidades.Alumno;
import java.util.List;
import modelo.AlumnoDAO;
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
@RequestMapping("/verAlu.htm")
public class LeerAlumnos {
 @Autowired
 private AlumnoDAO dao;
 
 
@RequestMapping(method = RequestMethod.GET)
public String verAlu(Model model){
	
List<Alumno> a = dao.readAllJPQL();

 if (a == null) {
                return "error";
 }
 
 model.addAttribute("listaAl",a);
 return "index";
 
}	
}
