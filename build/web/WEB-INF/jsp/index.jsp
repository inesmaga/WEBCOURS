
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE HTML 
 <html lang="es" >

<head>
        <meta name="viewport" content="width=device-width,user-scalable=si,initial-scale=1.0">
       <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 
        <link rel="stylesheet" type="text/css"  media ="all" href="resources/cursos.css">
<link rel="shortcut icon"  href="CWEB-ICO.ico"/>
        <title>WebCoursesCuban</title>
</head>
<body>
        <!--Contenedor-->

 <div id="container">
       <div id="header">
           
           <h1>CURSOS WEB</h1>
       </div>
       <div class="cuerpo">
           <ul class=tab>
             <li>
               <!--Pestaña 1 activa por defecto-->
               <input  type="radio" name="tab" id="tab1" class="tabs" checked />
               <label for="tab1"><a href ="vercat.htm">CATEGORIAS</a></label>
               <div class="tab-content">
                       <div class="board" >   
                   <table  colspan="1" >   
                      <c:forEach var="cg" items="${requestScope.listaCate}">
                       <tr>
                        <td ><c:out value="${cg.nombre}"></c:out></td>
                       </tr>
                      </c:forEach>
                     </table>         
                       <div class="cursos" >  
                               <h4> Ver Cursos de una Categoria:</h4>
               <form name="cursos" action="verCurCat.htm" method="POST" accept-charset="UTF-8">
                                                                                                     
                                                                 <select name="Cursos" >
                                                                       <c:forEach var="cg" items="${requestScope.listaCate}">
                           <option value="${cg.nombre}">${cg.nombre}</option>
                                                                                </c:forEach> 
                                                                 </select>
                                         <input class="button" type="submit"  value="Cursos ?" name="btncursos"/>
                              </form> 
                       </div>
     </div>    
               </div>
               </li>
               <li>
                <input  type="radio" name="tab" id="tab2" class="tabs"  />
                <label for="tab2"><a href ="vercur.htm">CURSOS</a></label>
                <div class="tab-content">
                    <div class="board" >     
                     <table  colspan="1" >   
                      <c:forEach var="cu" items="${requestScope.listaCursos}">
                       <tr>
                        <td ><c:out value="${cu.nombre}"></c:out></td>
                       </tr>
                      </c:forEach>
                     </table> 
               </div>
                </div>
              </li> 
              <li>
                    <input  type="radio" name="tab" id="tab3" class="tabs" />
                    <label for="tab3"><a href ="verMod.htm">MODULOS</a></label>
                     <div class="tab-content">
                             <div class="board" > 
                      <table  colspan="1" >   
                        <c:forEach var="m" items="${requestScope.listaMod}">
                         <tr>
                          <td ><c:out value="${m.nombre}"></c:out></td>
                         </tr>
                        </c:forEach>
                       </table>  
                             </div>
                      </div>
                     </li>
                     <li>
                      <input  type="radio" name="tab" id="tab4" class="tabs" />
                       <label for="tab4"><a href ="verTut.htm">TUTORES</a></label>
                       <div class="tab-content">
                          <div class="board" > 
                        <table  colspan="1" >   
                          <c:forEach var="tu" items="${requestScope.listaTut}">
                           <tr>
                           <td><c:out value="${tu.nombre} ${tu.apellidos}"></c:out></td>
                           </tr>
                           </c:forEach>
                         </table>  
                          </div>
                        </div>
                       </li>
                       <li>
                        <input  type="radio" name="tab" id="tab5" class="tabs"/>
                        <label for="tab5"><a href ="verAlu.htm">ALUMNOS</a></label>
                         <div class="tab-content">
                                  <div class="board" >
                             <table  colspan="1" >   
                          <c:forEach var="al" items="${requestScope.listaAl}">
                              
                           <tr>
                           <td><c:out value="${al.nombre}  ${al.apellidos}"></c:out></td>
                           </tr>
                           </c:forEach>
                         </table> 
                                     <div class="Alumncursos" >  
                         <h5> Ver Cursos de un Alumno:</h5>
                   <form name="alumncur" action="verCurAl.htm" method="POST" accept-charset="UTF-8">
                                                                
                                                                                
                                                                                                  <Select name="Alcur">
                                                                                <c:forEach var="al" items="${requestScope.listaAl}">
                                                                                    <option value="${al.nombre}">${al.nombre} ${al.apellidos} </option>
                                                                                </c:forEach> 
                                                                        </Select>
       <br /><input class="button"type="submit"  value="Cursos ?" name="btncursos" />
                                                                </form> 
                       </div>
                                  </div>
                          </div>
                        </li>
                  </ul>
           <img  id="logo" src="resources/desktop.png"/>
                </div>
     
                <footer>
                        <div class="filaFoot"> 
                                <div id="pcolumn">
                                <h2> email:cursoswebcub@gmail.com</h2>
                                <h2> Address:Madrid</h2> 
                                </div>
                                <div id="logom">
                                    <img src="resources/LogoMumtm.png"/>
                                </div>
                        </div>                                         

                </footer>	

        </div>	
</body>
</html>
