<h1>Crear ciudad</h1>
<form action="<%=request.getAttribute("baseURL")%>/ciudad/crear" method="post">
	<label for="nombre">Nombre: </label>
	<input type="text" class="form-control" id="nombre" name="nombre"><br>
	<input type="submit" class="btn btn-primary">
</form>