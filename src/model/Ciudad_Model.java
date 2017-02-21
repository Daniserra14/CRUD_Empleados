package model;


import java.util.List;

import org.hibernate.Transaction;
import org.mvc.Model;

import beans.Ciudad;


public class Ciudad_Model extends Model {
	public void guardarCiudad(Ciudad ciudad) {
		Transaction t =  ss.beginTransaction();
		ss.save(ciudad);
		t.commit();
	}

	@SuppressWarnings("unchecked")
	public List<Ciudad> getTodas() {
		return ss.createQuery("from Ciudad").list();
	}

	public Ciudad getCiudadById(long id) {
		return ss.get(Ciudad.class, id);
	}
}
