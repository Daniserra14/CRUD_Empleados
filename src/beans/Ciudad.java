package beans;

import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Ciudad {
	private Long id;
	private Collection<Empleado> empleados;
	private String nombre;

	public Ciudad() {
		this.empleados=new ArrayList<Empleado>();
	}
	
	public Ciudad(String nombre) {
		super();
		this.nombre = nombre;
		this.empleados=new ArrayList<Empleado>();
	}

	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}

	@Column(unique = true)
	public String getNombre() {
		return nombre;
	}

	@OneToMany (cascade = {CascadeType.ALL}, fetch=FetchType.LAZY, mappedBy="ciudad")
	public Collection<Empleado> getEmpleados() {
		return empleados;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEmpleados(Collection<Empleado> empleados) {
		this.empleados = empleados;
	}

	public void addToEmpleados(Empleado empleado) {
		this.empleados.add(empleado);
	}
	
}
