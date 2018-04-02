/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import entidades.Tutores;
import java.util.List;
import modelo.TutorDAO;
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
@RequestMapping("/verTut.htm")
public class LeerTutores {
@Autowired
private TutorDAO dao;
@RequestMapping(method = RequestMethod.GET)

public String VerTut(Model model){
List<Tutores> tu=dao.readAllJPQL();
 if (tu== null) {
                return "error";
 }
 model.addAttribute("listaTut", tu);
 return "index";
}
}
