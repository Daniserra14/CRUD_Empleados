<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>

<header class="container">

<div class="row">

<%-- <img src="${baseURL}assets/img/emple.jpg" class="img-rounded  center-block" alt="Empleados trabajando" height="100"> --%>

<div class="pull-right">

<c:choose> 
  <c:when test="${empty headerEmpleadoNombre}">
  		<a href="${baseURL}empleado/login">LOGIN</a>
  </c:when> 
  <c:otherwise>
  		${headerEmpleadoNombre} ${headerEmpleadoApe1} <a href="${baseURL}empleado/logout">LOGOUT</a>
  </c:otherwise> 
</c:choose>

</div>

</div>

</header>