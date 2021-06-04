package web.practicas.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "proyecto")
public class Proyecto extends Base {

	@Column(name = "nombre")
	private String nombre;
	@Column(name = "equipo")
	private String equipo;
	@OneToMany
	List<ProyectoAtributo> atributo;


	public Proyecto(String nombre, String equipo, List<ProyectoAtributo> atributo) {
		super();
		this.nombre = nombre;
		this.equipo = equipo;
		this.atributo = atributo;
	}




	public List<ProyectoAtributo> getAtributo() {
		return atributo;
	}




	public void setAtributo(List<ProyectoAtributo> atributo) {
		this.atributo = atributo;
	}




	public Proyecto(String nombre, String equipo) {
		super();
		this.nombre = nombre;
		this.equipo = equipo;

	}




	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEquipo() {
		return equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

}
