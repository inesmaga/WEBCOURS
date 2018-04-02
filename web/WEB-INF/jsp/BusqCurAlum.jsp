<%-- 
    Document   : BusqCurAlum
    Created on : 13-oct-2017, 5:00:05
    Author     : inesm
--%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core"prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>

<!DOCTYPE html>
<html lang="es" >
    
       <head>
                <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                 <meta name="viewport" content="width=device-width,user-scalable=si,initial-scale=1.0">
       <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
   

        <link rel="stylesheet" type="text/css"  media ="all" href="resources/cursos.css">

                <title>BusquedaCursosAl</title>
       </head>
  <body>
            <div id="container">
       <div id="header">
           <h1>CURSOS WEB</h1>
       </div>
       <div class="cuerpo">
           <ul class=tab>
             <li>
              
               <input  type="radio" name="tab" id="tab1" class="tabs"  />
               <label for="tab1"><a href ="vercat.htm">CATEGORIAS</a></label>
               <div class="tab-content">
                   
                      
              </div>                    
            </li>
               <li>
                    <input  type="radio" name="tab" id="tab2" class="tabs" checked />
                <label for="tab2">CURSOS</label>
                <div class="tab-content">
                     <h3>Alumno: ${requestScope.listaCurA[0].alumn.nombre} ${requestScope.listaCurA[0].alumn.apellidos} </h3> 
                           <h4> Cursos:</h4>
                           <div class="board" > 
                        <table  colspan="1" > 
                                
                          <c:forEach var="cu" items="${requestScope.listaCurA}">
                           <tr>
                           <td><c:out value=" - ${cu.nombre} "></c:out></td>
                           </tr>
                           </c:forEach>
                         </table>
                                    
                        </div>
                           
                       
                    </div>
                </li>         
               
                 <li>
                    <input  type="radio" name="tab" id="tab3" class="tabs" />
                    <label for="tab3">MODULOS</label>
                    
                     <div class="tab-content">
                    
                    </div>
                     
                     </li>
                     <li>
                    <input  type="radio" name="tab" id="tab4" class="tabs" />
                    <label for="tab4">TUTORES</label>
                    
                     <div class="tab-content">
                     </div>
                     </li>   
                      
                <li>
                <input  type="radio" name="tab" id="tab5" class="tabs"  />
                <label for="tab5">ALUMNOS</label>
                <div class="tab-content">
                 
                           
                       </div>
                      </li>
           </ul>
       </div>
                      <footer>
                        <div class="filaFoot">   
                                <h2> email:cursoswebcub@gmail.com</h2>
                                <h2> Address:Madrid</h2> 
                        </div>                                         

                </footer>	
            </div>
 </body>
</html>
