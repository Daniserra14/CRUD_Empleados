package model;

import java.util.List;

import org.hibernate.Transaction;
import org.mvc.Model;

import beans.Empleado;

public class Empleado_Model extends Model {
	public void guardarEmpleado(Empleado empleado) throws Exception {
		Transaction t =  ss.beginTransaction();
		ss.save(empleado); 
//		ss.persist(empleado);
		t.commit();
	}

	@SuppressWarnings("unchecked")
	public List<Empleado> getTodos() {
		return ss.createQuery("from Empleado").list();
	}
}
