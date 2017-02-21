package org.mvc;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Controller
 */
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected HttpServletRequest request;
	protected HttpServletResponse response;
	protected String baseURL;
	protected Map<String,Object> datos=new HashMap<String,Object>();
	
    
    protected void ejecutar(String modo, HttpServletRequest request, HttpServletResponse response){
    	this.request = request;
    	this.response = response;
    	String URI = request.getRequestURI();
    	this.baseURL = request.getRequestURL().toString().substring(0,
				request.getRequestURL().toString().length() - request.getRequestURI().length()) + request.getContextPath()
				+"";
    	this.request.setAttribute("baseURL",this.baseURL);
    	
    	String accion;
    	try{
    		accion = URI.split("/")[3];
    	}catch(ArrayIndexOutOfBoundsException er){
    		accion = "index";
    	}
    	
    	try {
			Method method = this.getClass().getMethod(accion+(modo.substring(0,1).toUpperCase())+modo.substring(1));
			method.invoke(this);
		} catch (NoSuchMethodException e) {
			System.out.println("No existe el método "+accion+(modo.substring(0,1).toUpperCase())+modo.substring(1));
			request.setAttribute("accion", accion);
			view("/error/NoAction.jsp", true);
		}
    	catch ( SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException  e) {
    		System.out.println("Error en el método "+accion+(modo.substring(0,1).toUpperCase())+modo.substring(1)+": "+e.getCause());
		}
    }
    
    protected void view(String rutaADesplegar, boolean estaEnmarcada){
    	String rutaVista = "/view/"+rutaADesplegar;
    	request.setAttribute("rutaVista", rutaVista);
    	
    	request.setAttribute("baseURL", baseURL);
    	
    	for (String k : datos.keySet()) {
			request.setAttribute(k, datos.get(k));
		}
    	
    	try {
			request.getRequestDispatcher(estaEnmarcada?"/view/_templates/_MASTER.jsp":rutaVista).forward(request, response);
		} catch (ServletException | IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getCause());
		}
    }
    
    protected void view(String rutaADesplegar){
    	view(rutaADesplegar,true);
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ejecutar("get",request,response);
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ejecutar("post",request,response);
	}

}
