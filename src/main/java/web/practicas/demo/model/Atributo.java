package web.practicas.demo.model;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="atributo")
public class Atributo{
	@Id
	@Column(name="nombre_Atributo")
	private String NombreAtributo;
	@Column(name="tipo_Dato")
	private String tipoDato;
	@Column(name="descripcion")
	private String descripcion;

	public Atributo(String nombreAtributo, String tipoDato, String descripcion) {
		super();
		NombreAtributo = nombreAtributo;
		this.tipoDato = tipoDato;
		this.descripcion = descripcion;
	}
	public Atributo() {
		super();
	}

	public String getNombreAtributo() {
		return NombreAtributo;
	}
	public void setNombreAtributo(String nombreAtributo) {
		NombreAtributo = nombreAtributo;
	}
	public String getTipoDato() {
		return tipoDato;
	}
	public void setTipoDato(String tipoDato) {
		this.tipoDato = tipoDato;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	

}
