package controller;

import javax.servlet.annotation.WebServlet;

import org.mvc.Controller;

@WebServlet("")
public class Home_Controller extends Controller {
	public void indexGet(){
		view("home/bienvenido.jsp");
	}
}
