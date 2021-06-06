package web.practicas.demo.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass

public class Base {

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Long Id;

	public Base() {
		super();
	}

	public Base(Long id) {
		super();
		Id = id;
	}
	
	
}
