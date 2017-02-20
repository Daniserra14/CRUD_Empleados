package controller;

import javax.servlet.annotation.WebServlet;

import org.mvc.Controller;

import beans.LP;
import model.LP_Model;

@WebServlet({"/lp","/lp/","/lp/*"})
public class LP_Controller extends Controller {
	public void indexGet(){
		crearGet();
	}

	public void crearGet() {
		view("lp/crear.jsp");
	}
	
	public void crearPost(){
		String nombre = request.getParameter("nombre");
		LP lp = new LP(nombre);
		LP_Model lpModel = new LP_Model();
		lpModel.guardarLP(lp);
		
		datos.put("nombreLP", nombre);
		view("lp/crearPost.jsp");
	}
}