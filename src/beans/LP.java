package beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class LP {

	public LP(String nombre) {
		this.nombre = nombre;
	}

	private long id;
	
	private String nombre;
	
	@Id
	@GeneratedValue
	public long getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
