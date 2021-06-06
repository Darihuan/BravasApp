package web.practicas.demo.model;

import java.io.Serializable;



public class Primarykey implements Serializable{
	
	long proyecto;
	
	String atributo;
	

	

	public Primarykey() {
		super();
	}


	public long getProyecto() {
		return proyecto;
	}

	public void setProyecto(long proyecto) {
		this.proyecto = proyecto;
	}

	public String getAtributo() {
		return atributo;
	}

	public void setAtributo(String atributo) {
		this.atributo = atributo;
	}
}
