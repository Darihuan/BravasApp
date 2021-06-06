package web.practicas.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import web.practicas.demo.model.Atributo;

public interface AtributoRepository  extends JpaRepository<Atributo, String>{
	
	

}
