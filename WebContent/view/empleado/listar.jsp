<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<h1>Listar ciudades</h1>
<label>Filtro: </label>
<input type="text">
<table class="table table-hover table-stripped">
	<thead>
      <tr>
        <th>Nombre</th>
        <th>Primer apellido</th>
        <th>Segundo apellido</th>
        <th>Teléfono</th>
        <th>Ciudad</th>
        <th>Lenguajes de programación</th>
      </tr>
    </thead>
    <tbody>
    	<c:forEach var="empleado" items="${empleados}">
    		<tr>
    			<td> ${empleado.nombre }</td>
    			<td> ${empleado.apellido1 }</td>
    			<td> ${empleado.apellido2 }</td>
    			<td> ${empleado.telefono }</td>
    			<td> ${empleado.ciudad.nombre }</td>
    			<td> |
    				<c:forEach var="lp" items="${empleado.lps }">
    					${lp.nombre} |
    				</c:forEach> 
    			</td>
    			<td>
    				<button><span class="glyphicon glyphicon-pencil"></span></button> 
    				<button><span class="glyphicon glyphicon-remove"></span></button>
    			</td>
    		</tr>
    	</c:forEach>
    </tbody>
</table>