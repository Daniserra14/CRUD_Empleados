<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<h1>Listar ciudades</h1>
<table class="table table-hover table-stripped">
	<thead>
      <tr>
        <th>Nombre</th>
      </tr>
    </thead>
    <tbody>
    	<c:forEach var="ciudad" items="${ciudades}">
    		<tr>
    			<td> ${ciudad.nombre }</td>
    			<td><button><span class="glyphicon glyphicon-pencil"></span></button> <button><span class="glyphicon glyphicon-remove"></span></button></td>
    		</tr>
    	</c:forEach>
    </tbody>
</table>