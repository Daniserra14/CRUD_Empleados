<nav class="container navbar navbar-inverse">
  <div class="navbar-header">
    <a class="navbar-brand" href="${baseURL}">CRUD-emple</a>
  </div>
  <div class="collapse navbar-collapse" id="myNavbar">
    <ul class="nav navbar-nav">
    
      <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="${baseURL}/empleado/crear">
           Empleado<span class="caret"></span>
        </a>
		<ul class="dropdown-menu">
		
		  <?php if (isset($header['empleado']['nombre'])): ?>
		  <li><a href="${baseURL}/empleado/crear">Crear</a></li>
		  <li><a href="${baseURL}/empleado/modificar">Modificar</a></li>
		  <li><a href="${baseURL}/empleado/borrar">Borrar</a></li>
		  <?php endif;?>
		  
		  <li><a href="${baseURL}empleado/listar">Listar</a></li>

	     </ul>
      </li>

      <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="${baseURL}/ciudad/crear">
           Ciudad<span class="caret"></span>
        </a>
		<ul class="dropdown-menu">
		  <?php if (isset($header['empleado']['nombre'])): ?>
		  <li><a href="${baseURL}/ciudad/crear">Crear</a></li>
		  <li><a href="${baseURL}/ciudad/modificar">Modificar</a></li>
		  <li><a href="${baseURL}/ciudad/borrar">Borrar</a></li>
		  <?php endif;?>

		  <li><a href="${baseURL}/ciudad/listar">Listar</a></li>
	     </ul>
      </li>

      <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="${baseURL}/lp/crear">
           Lenguaje de programación<span class="caret"></span>
        </a>
		<ul class="dropdown-menu">
		  <?php if (isset($header['empleado']['nombre'])): ?>
		  <li><a href="${baseURL}/lp/crear">Crear</a></li>
		  <li><a href="${baseURL}/lp/modificar">Modificar</a></li>
		  <li><a href="${baseURL}/lp/borrar">Borrar</a></li>
		  <?php endif;?>
		  <li><a href="${baseURL}/lp/listar">Listar</a></li>
	     </ul>
      </li>



    </ul>
  </div>
</nav>


