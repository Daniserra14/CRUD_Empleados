<nav class="container navbar navbar-inverse">
  <div class="navbar-header">
    <a class="navbar-brand" href="${baseURL}">CRUD-emple</a>
  </div>
  <div class="collapse navbar-collapse" id="myNavbar">
    <ul class="nav navbar-nav">
    
      <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#">
           Empleado<span class="caret"></span>
        </a>
		<ul class="dropdown-menu">
		
		  <?php if (isset($header['empleado']['nombre'])): ?>
		  <li><a href="${baseURL}empleado/crear">Crear</a></li>
		  <?php endif;?>
		  
		  <li><a href="${baseURL}empleado/listar">Listar</a></li>

	     </ul>
      </li>

      <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#">
           Ciudad<span class="caret"></span>
        </a>
		<ul class="dropdown-menu">
		  <?php if (isset($header['empleado']['nombre'])): ?>
		  <li><a href="${baseURL}ciudad/crear">Crear</a></li>
		  <?php endif;?>

		  <li><a href="${baseURL}ciudad/listar">Listar</a></li>
	     </ul>
      </li>

      <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#">
           Lenguaje de programación<span class="caret"></span>
        </a>
		<ul class="dropdown-menu">
		  <?php if (isset($header['empleado']['nombre'])): ?>
		  <li><a href="${baseURL}lp/crear">Crear</a></li>
		  <?php endif;?>
		  <li><a href="${baseURL}lp/listar">Listar</a></li>
	     </ul>
      </li>



    </ul>
  </div>
</nav>


