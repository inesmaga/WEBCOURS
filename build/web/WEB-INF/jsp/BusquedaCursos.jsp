<%-- 
    Document   : BusquedaCursos
    Created on : 06-oct-2017, 6:18:49
    Author     : inesm
--%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html lang="es" >
    
       <head>
                <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                 <meta name="viewport" content="width=device-width,user-scalable=si,initial-scale=1.0">
       <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
   

        <link rel="stylesheet" type="text/css"  media ="all" href="resources/cursos.css">

                <title>BusquedaCursos</title>
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
                  
                       <h3> Categoria: ${requestScope.listaCurs[0].idcategoria.nombre}</h3>
                           <h4>Cursos:</h4>
                           <div class="board" > 
        <table  colspan="1" >   
                      <c:forEach var="cu" items="${requestScope.listaCurs}">
                       <tr>
                        <td ><c:out value=" - ${cu.nombre}"></c:out></td>
                       </tr>
                      </c:forEach>
                     </table> 
                 <div class="datos">
                 <div class="modulos" >  
                         <h5> Ver Modulos de un Curso:</h5>
                   <form name="modulos" action="verModCur.htm" method="POST" accept-charset="UTF-8">
                                                                
                                                                                
                                                                                                  <Select name="modulos">
                                                                                <c:forEach var="cu" items="${requestScope.listaCurs}">
                                                                                    <option value="${cu.nombre}">${cu.nombre}</option>
                                                                                </c:forEach> 
                                                                        </Select>
       <br /><input class="button"type="submit"  value="Modulos ?" name="btnmodulos" />
                                                                </form> 
                       </div>
           <div class="tutores" > 
                                     <h5> Ver Tutores de un Curso:</h5>
                   <form name="modulos" action="verTutCur.htm" method="POST" accept-charset="UTF-8">
                                                                
                                                                                
                                                           <Select name="tutores">
                                                                  <c:forEach var="cu" items="${requestScope.listaCurs}">
                                                                                    <option value="${cu.nombre}">${cu.nombre}</option>
                                                                                </c:forEach> 
                                                                        </Select>
       <br /><input class="button"type="submit"  value="Tutores ?" name="btntutores" />
                                                                </form> 
                       </div>
                 </div>
                    </div>
                </div>
                </li> 
                 <li>
                    <input  type="radio" name="tab" id="tab3" class="tabs" />
                    <label for="tab3"><a href ="verMod.htm">MODULOS</a></label>
                     <div class="tab-content">
                      <table  colspan="1" >   
                        <c:forEach var="m" items="${requestScope.listaMod}">
                         <tr>
                          <td ><c:out value="${m.nombre}"></c:out></td>
                         </tr>
                        </c:forEach>
                       </table>                    
                      </div>
                     </li>
                     <li>
                      <input  type="radio" name="tab" id="tab4" class="tabs" />
                       <label for="tab4"><a href ="verTut.htm">TUTORES</a></label>
                       <div class="tab-content">
                        <table  colspan="1" >   
                          <c:forEach var="tu" items="${requestScope.listaTut}">
                           <tr>
                           <td><c:out value="${tu.nombre} ${tu.apellidos}"></c:out></td>
                           </tr>
                           </c:forEach>
                         </table>                      
                        </div>
                       </li>
                       <li>
                        <input  type="radio" name="tab" id="tab5" class="tabs"/>
                        <label for="tab5"><a href ="verAlu.htm">ALUMNOS</a></label>
                         <div class="tab-content">
                             <table  colspan="1" >   
                          <c:forEach var="al" items="${requestScope.listaAl}">
                              
                           <tr>
                           <td><c:out value="${al.nombre}  ${al.apellidos}"></c:out></td>
                           </tr>
                           </c:forEach>
                         </table>         
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
