package controller;

import java.util.List;

import javax.servlet.annotation.WebServlet;

import org.mvc.Controller;

import beans.Lp;
import model.LP_Model;

@WebServlet({"/lp","/lp/","/lp/*"})
public class LP_Controller extends Controller {
	public void indexGet(){
		listarGet();
	}

	public void crearGet() {
		view("lp/crear.jsp");
	}
	
	public void crearPost(){
		String nombre = request.getParameter("nombre");
		Lp lp = new Lp(nombre);
		LP_Model lpModel = new LP_Model();
		lpModel.guardarLP(lp);
		
		datos.put("nombreLP", nombre);
		view("lp/crearPost.jsp");
	}
	
	public void listarGet(){
		LP_Model lpModel = new LP_Model();
		List<Lp> lps = lpModel.getTodas();
		
		datos.put("lps",lps);
		view("lp/listar.jsp");
	}
}
