package model;

import org.hibernate.Transaction;
import org.mvc.Model;

import beans.Empleado;

public class Empleado_Model extends Model {
	public void guardarEmpleado(Empleado empleado) throws Exception {
		Transaction t =  ss.beginTransaction();
//		ss.save(empleado); //TODO DEBUG
		ss.persist(empleado);
		t.commit();
	}
}
