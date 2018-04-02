/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import entidades.Categorias;
import entidades.Cursos;
import entidades.Modulos;
import java.util.List;
import modelo.CategoriasDAO;
import modelo.CursosDAO;
import modelo.ModulosDAO;
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
@RequestMapping("/verMod.htm")
public class LeerModulos {
@Autowired
 
private ModulosDAO dao;
 @RequestMapping(method = RequestMethod.GET)

 

public String verMod(Model model){
List<Modulos> m = dao.readAllJPQL();

 if (m== null) {
                return "error";
 }
 
 model.addAttribute("listaMod",m);
 return "index";
 
}
 
}
