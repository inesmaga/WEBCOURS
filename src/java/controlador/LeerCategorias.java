/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import entidades.Categorias;
import java.util.List;
import modelo.CategoriasDAO;
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
@RequestMapping("/vercat.htm")
public class LeerCategorias {
 @Autowired
 private CategoriasDAO dao;
 
 
@RequestMapping(method = RequestMethod.GET)
public String vercat(Model model){
List<Categorias> c = dao.readAllJPQL();

 if (c == null) {
                return "error";
 }
 
 model.addAttribute("listaCate",c);
 return "index";
 
}

   
}
