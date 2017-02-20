package beans;

import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Empleado {
	private Long id;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String password;
	private String telefono;
	private Ciudad ciudad;
	private Collection<LP> lps;
	

	public Empleado() {
		this.lps=new ArrayList<LP>();
	}

	public Empleado(String nombre, String apellido1, String apellido2, String password, String telefono, Ciudad ciudad,
			Collection<LP> lps) {
		super();
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.password = password;
		this.telefono = telefono;
		
		this.ciudad = ciudad;
		this.ciudad.addToEmpleados(this);
		
		this.lps = lps;
		for (LP lp:lps) {
			//lp.addToEmpleados(this);
		}
	}

	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public String getPassword() {
		return password;
	}

	public String getTelefono() {
		return telefono;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	public Ciudad getCiudad() {
		return ciudad;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	public Collection<LP> getLps() {
		return lps;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	
	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

	public void setLps(Collection<LP> lps) {
		this.lps = lps;
	}
	
}
