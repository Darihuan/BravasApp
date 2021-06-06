package web.practicas.demo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.bytebuddy.asm.Advice.Return;
import web.practicas.demo.model.Logueo;
import web.practicas.demo.model.UsuarioDto;
import web.practicas.demo.model.Usuarios;
import web.practicas.demo.service.BaseServiceImplementation;
import web.practicas.demo.service.UsuarioService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v01/usuarios")
public class UsuarioRest  extends BaseControllerImplementation<Usuarios,UsuarioService>{
	@Autowired
	UsuarioService service;

	public UsuarioRest(UsuarioService service) {
		super(service);
		
	}
	@PutMapping("/update/{id}")
	public ResponseEntity<?> Update(@PathVariable Long id,@RequestBody Usuarios usuario) {
		try {
			service.update(id, usuario);
			return ResponseEntity.status(HttpStatus.OK).body(usuario);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{error:Petición incorrecta}");
		}
		
	}

	@PostMapping("/login")
	public ResponseEntity<Logueo> islogged(@RequestBody UsuarioDto usuariolog) {
		
		
		try {
			return ResponseEntity.status(HttpStatus.OK).body(service.isLogged(usuariolog));
			
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new Logueo(0l));
			
		}
		
		
	}
	
	
	
	

}
