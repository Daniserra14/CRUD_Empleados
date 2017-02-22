package model;

import java.util.List;

import org.hibernate.Transaction;
import org.mvc.Model;

import beans.Ciudad;
import beans.Lp;

public class LP_Model extends Model {
	public void guardarLP(Lp lp){
		Transaction t = ss.beginTransaction();
		ss.save(lp);
		t.commit();
		
	}

	@SuppressWarnings("unchecked")
	public List<Lp> getTodas() {
		return ss.createQuery("from Lp").list();
	}

	public Lp getLpById(Long id) {
		return ss.get(Lp.class, id);
	}
}
