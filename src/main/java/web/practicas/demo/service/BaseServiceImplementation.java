package web.practicas.demo.service;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import web.practicas.demo.model.Base;
import web.practicas.demo.repository.BaseRepository;

public class BaseServiceImplementation<E extends Base, ID extends Serializable> implements BaseService<E, ID> {
	@Autowired
	BaseRepository<E, ID> repository;

	public List<E> listall() throws Exception {

		try {
			return repository.findAll();
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}

	}

	@Override
	public Optional<E> listbyid(ID id) throws Exception {

		try {
			return repository.findById(id);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}

	}

	
	public void add(E entidad) throws Exception {

		try {
			repository.save(entidad);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}

	}

	
	public void update(ID id, E entidad) throws Exception {

		try {
			if(id==entidad.getId())
			repository.save(entidad);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}

	}

	@Override
	public void delete(ID id) throws Exception {

		try {
			repository.deleteById(id);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}

	}

}
