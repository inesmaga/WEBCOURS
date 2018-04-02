<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>



<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE HTML 
<html>
        <head>
                <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                  <meta name="viewport" content="width=device-width,user-scalable=si,initial-scale=1.0">
                <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
             <link rel="stylesheet" type="text/css"  media ="all" href="resources/cursos.css">
                
                <title>WebCourses</title>
        </head>
<body>
		<!--Contenedor-->
	<div id="container">
		<h1>Tabs with CSS3 & HTML5 only</h1>
		<!--Pestaña 1 activa por defecto-->
	<ul class=tab>
	  <li>
	    <input  type="radio" name="tab" id="tab1" class="tabs" checked />
	    <label for="tab1">Pestaña1</label>
	    <div class="tab-content">
	            "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Voluptatum sit reprehenderit iusto harum minima. Assumenda, accusamus, perspiciatis inventore tempora qui pariatur quisquam? Deleniti, placeat ea nostrum officiis obcaecati temporibus quod. Ullam, in, adipisci autem at fugit ab tempore enim ratione nesciunt alias corporis vitae quo quod nostrum itaque vero iure?"
	      </div>
	  </li>
	    <li>
	    <input  type="radio" name="tab" id="tab2" class="tabs"  />
	    <label for="tab2">Pestaña2</label>
	    <div class="tab-content">
	            "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Voluptatum sit reprehenderit iusto harum minima. Assumenda, accusamus, perspiciatis inventore tempora qui pariatur quisquam? Deleniti, placeat ea nostrum officiis obcaecati temporibus quod. Ullam, in, adipisci autem at fugit ab tempore enim ratione nesciunt alias corporis vitae quo quod nostrum itaque vero iure?"
	      </div>
	  </li> 
	   <li>
	    <input  type="radio" name="tab" id="tab3" class="tabs"  />
	    <label for="tab3">Pestaña3</label>
	    <div class="tab-content">
	            "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Voluptatum sit reprehenderit iusto harum minima. Assumenda, accusamus, perspiciatis inventore tempora qui pariatur quisquam? Deleniti, placeat ea nostrum officiis obcaecati temporibus quod. Ullam, in, adipisci autem at fugit ab tempore enim ratione nesciunt alias corporis vitae quo quod nostrum itaque vero iure?"
	      </div>
	  </li>
	</ul>
	</div>
</body>

 
</html>

