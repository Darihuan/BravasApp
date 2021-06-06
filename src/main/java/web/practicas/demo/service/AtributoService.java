package web.practicas.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import web.practicas.demo.model.Atributo;
import web.practicas.demo.repository.AtributoRepository;

public class AtributoService  {
	@Autowired
	AtributoRepository repository;
	
	public List<Atributo> listall() throws Exception {

		try {
			return repository.findAll();
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}

	}

	
	public Optional<Atributo> listbyid(String id) throws Exception {

		try {
			return repository.findById(id);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}

	}

	
	public void add(Atributo entidad) throws Exception {

		try {
			repository.save(entidad);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}

	}

	
	public void update(String id, Atributo entidad) throws Exception {

		try {
			if(id.equals(entidad.getNombreAtributo()))
			repository.save(entidad);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}

	}

	
	public void delete(String id) throws Exception {

		try {
			repository.deleteById(id);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}

	}

}
