package web.practicas.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import web.practicas.demo.model.Base;
import web.practicas.demo.service.BaseServiceImplementation;

public class BaseControllerImplementation<E extends Base, S extends BaseServiceImplementation<E, Long>>
		implements BaseController<E, Long> {

	S service;

	public BaseControllerImplementation(S service) {
		super();
		this.service = service;
	}

	@GetMapping("")
	public ResponseEntity<List<E>> listall() throws Exception {
		try {

			return ResponseEntity.status(HttpStatus.OK).body(service.listall());
		} catch (Exception e) {

			throw new Exception(e.getMessage());
		}
	}

	@GetMapping("/{id}")
	public ResponseEntity<E> listbyid(Long id) throws Exception {

		try {

			return ResponseEntity.status(HttpStatus.OK).body(service.listbyid(id).get());
		} catch (Exception e) {

			throw new Exception(e.getMessage());
		}
	}

	@PostMapping("")
	public ResponseEntity<E> add(E entidad) throws Exception {
		try {
			service.add(entidad);
			return ResponseEntity.status(HttpStatus.OK).body(entidad);
		} catch (Exception e) {

			throw new Exception(e.getMessage());
		}

	}

	@PutMapping("/{id}")
	public ResponseEntity<E> update(Long id, E entidad) throws Exception {
		try {

			service.update(id, entidad);
			return ResponseEntity.status(HttpStatus.OK).body(entidad);
		} catch (Exception e) {

			throw new Exception(e.getMessage());
		}

	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> delete(Long id) throws Exception {

		try {
			service.delete(id);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body("{'Petición':'Recurso Borrado'}");
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{'error':'Petición invalida'}");
		}
	}

}
