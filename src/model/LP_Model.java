package model;

import org.hibernate.Transaction;
import org.mvc.Model;

import beans.LP;

public class LP_Model extends Model {
	public void guardarLP(LP lp){
		Transaction t = ss.beginTransaction();
		ss.save(lp);
		t.commit();
		
	}
}
