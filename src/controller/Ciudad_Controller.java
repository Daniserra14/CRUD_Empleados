	package controller;

import java.util.List;

import javax.servlet.annotation.WebServlet;

import org.mvc.Controller;

import beans.Ciudad;
import model.Ciudad_Model;

/**
 * Servlet implementation class Ciudad
 */
@WebServlet({"/ciudad","/ciudad/","/ciudad/*"})
public class Ciudad_Controller extends Controller {
    public void indexGet(){
    	listarGet();
    }

    public void crearGet(){
    	view("ciudad/crear.jsp");
    }
    
    public void crearPost(){
    	String nombre = request.getParameter("nombre");
    	Ciudad ciudad = new Ciudad(nombre);
    	
    	Ciudad_Model ciudadModel = new Ciudad_Model();
    	ciudadModel.guardarCiudad(ciudad);
    	
    	datos.put("nombreCiudad", nombre);
    	view("ciudad/crearPost.jsp");
    	
    }
    
    public void listarGet(){
    	Ciudad_Model ciudadModel = new Ciudad_Model();
    	List<Ciudad> ciudades = ciudadModel.getTodas();
    	
    	datos.put("ciudades", ciudades);
    	view("ciudad/listar.jsp");
    }
}
