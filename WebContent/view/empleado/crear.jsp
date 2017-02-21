<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<h1>Crear Lenguaje de programación</h1>
<form action="<%=request.getAttribute("baseURL")%>empleado/crear" method="post">
	<label for="idNombre">Nombre: </label>
	<input type="text" class="form-control" id="idNombre" name="nombre"><br>
	
	<label for="idApe1">Primer apellido: </label>
	<input type="text" class="form-control" id="idApe1" name="ape1"><br>
	
	<label for="idApe2">Segundo apellido: </label>
	<input type="text" class="form-control" id="idApe2" name="ape2"><br>
	
	<label for="idPwd">Contraseña: </label>
	<input type="password" class="form-control" id="idPwd" name="pwd"><br>
	
	<label for="idTlf">Teléfono: </label>
	<input type="text" class="form-control" id="idTlf" name="tlf"><br>
	
	
	<label for="idCiudad">Ciudad:</label>
	<select class="form-control" name="idCiudad" id="idCiudad">
		<c:forEach  var="ciudad" items="${ciudades}">
			<option value="${ciudad.getId()}">${ciudad.getNombre()}</option>
		</c:forEach>
	</select><br>
	<div class="form-group">
			<fieldset>
			<legend>Lenguajes de programación que conoce</legend> 
				<c:forEach var="lp" items="${lps}">
					<input id="id${lp.id}" type="checkbox" value="${lp.id}" name="idLP[]">
					<label for="id${lp.id}">${lp.nombre} </label>
				</c:forEach>
			</fieldset>
		</div>
	<input type="submit" class="btn btn-primary">
</form>