package controller;

import java.util.List;

import javax.servlet.annotation.WebServlet;

import org.mvc.Controller;

import beans.Ciudad;
import model.Ciudad_Model;

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
    	view("empleado/crear.jsp");
    }
}
