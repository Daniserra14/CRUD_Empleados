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
    		<tr><td> ${ciudad.nombre }</td></tr>
    	</c:forEach>
    </tbody>
</table>