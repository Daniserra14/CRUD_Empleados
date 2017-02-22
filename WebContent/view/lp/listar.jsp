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
    		<tr><td> ${lp.nombre }</td></tr>
    	</c:forEach>
    </tbody>
</table>