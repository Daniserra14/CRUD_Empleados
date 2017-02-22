package controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.annotation.WebServlet;

import org.mvc.Controller;

import beans.Ciudad;
import beans.Empleado;
import beans.Lp;
import model.Ciudad_Model;
import model.Empleado_Model;
import model.LP_Model;

/**
 * Servlet implementation class Empleado
 */
@WebServlet({"/empleado","/empleado/","/empleado/*"})
public class Empleado_Controller extends Controller{

    public void indexGet(){
    	crearGet();
    }

    public void crearGet(){
    	Ciudad_Model ciudadModel = new Ciudad_Model();
    	List<Ciudad> ciudades = ciudadModel.getTodas();
    	datos.put("ciudades", ciudades);
    	
    	LP_Model lpModel = new LP_Model();
    	List<Lp> lps = lpModel.getTodas();
    	datos.put("lps", lps);
    	
    	view("empleado/crear.jsp");
    }
    
    public void crearPost(){
    	Empleado_Model empleadoModel = new Empleado_Model();
    	Ciudad_Model ciudadModel = new Ciudad_Model();
    	LP_Model lpModel = new LP_Model();
    	
    	String nombre = request.getParameter("nombre");
    	String ape1 = request.getParameter("ape1");
    	String ape2 = request.getParameter("ape2");
    	String pwd = request.getParameter("pwd");
    	String tlf = request.getParameter("tlf");
    	Ciudad ciudad = ciudadModel.getCiudadById(Long.parseLong(request.getParameter("idCiudad")));
    	
    	
    	List<Lp> lps = new ArrayList<Lp>();;
		for (String idLpString : request.getParameterValues("idLP[]")) {
			Long idLpLong = Long.parseLong(idLpString);
			Lp lp = lpModel.getLpById(idLpLong);
			lps.add(lp);
		}
    	
    	Empleado empleado = new Empleado(nombre, ape1, ape2, pwd, tlf, ciudad, lps);
    	try {
    		//HAY QUE HACER DROP A EMPLEADO_LP Y EMPLEADO PARA QUE LAS CREE DE NUEVO Y FUNCIONE
			empleadoModel.guardarEmpleado(empleado);
			datos.put("nombreCompletoEmpleado", nombre+" "+ape1+" "+ape2);
	    	view("empleado/crearPost.jsp");
		} catch (Exception e) {
			System.out.println("Error al guardar el empleado");
			System.out.println(e.getCause());
			e.printStackTrace();
		}
    	
    	
    }
    
    public void listarGet(){
    	Empleado_Model empleadoModel = new Empleado_Model();
    	List<Empleado> empleados = empleadoModel.getTodos();
    	
    	datos.put("empleados", empleados);
    	view("empleado/listar.jsp");    	
    }
}
