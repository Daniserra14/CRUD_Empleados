<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<h1>Listar Lenguajes de programación</h1>
<table class="table table-hover table-stripped">
	<thead>
      <tr>
        <th>Nombre</th>
      </tr>
    </thead>
    <tbody>
    	<c:forEach var="lp" items="${lps}">
    		<tr>
    			<td> ${lp.nombre }</td>
    			<td><button><span class="glyphicon glyphicon-pencil"></span></button> <button><span class="glyphicon glyphicon-remove"></span></button></td>
    		</tr>
    	</c:forEach>
    </tbody>
</table>