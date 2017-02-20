<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<h1>Crear Lenguaje de programación</h1>
<form action="<%=request.getAttribute("baseURL")%>/lp/crear" method="post">
	<label for="nombre">Nombre: </label>
	<input type="text" class="form-control" id="nombre" name="nombre"><br>
	<div class="form-group">
			<fieldset>
			<legend>Lenguajes de programación que conoce</legend> 
				<c:forEach var="lp" items="${lps}">
					<input id="id${lp.id}" type="checkbox" value="${lp.id}" name="idLP[]">
					<label for="id${lp.id}">${lp.nombre}</label>
				</c:forEach>
			</fieldset>
		</div>
	<input type="submit" class="btn btn-primary">
</form>