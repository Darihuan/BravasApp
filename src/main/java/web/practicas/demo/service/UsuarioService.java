package web.practicas.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;

import web.practicas.demo.model.Logueo;
import web.practicas.demo.model.UsuarioDto;
import web.practicas.demo.model.Usuarios;
import web.practicas.demo.repository.UsuarioRepository;

@Service
public class UsuarioService extends BaseServiceImplementation<Usuarios, Long> {
	@Autowired
	UsuarioRepository repositorio;

	public UsuarioService(UsuarioRepository repositorio) {
		this.repositorio = repositorio;
	}

	
	public void update(Long id, Usuarios usuario) throws Exception {
		try {
			if(id==usuario.getId())
				repository.save(usuario);

			

		} catch (Exception e) {

			throw new Exception(e.getMessage());
		}

	}

	public List<Usuarios> SearchUsuariobyemail(String email) throws Exception {
		try {

			return repositorio.findByemail(email);

		} catch (Exception e) {

			throw new Exception(e.getMessage());
		}
	}

	public Logueo isLogged(UsuarioDto usuariolog) throws Exception {

		try {

			String username = usuariolog.getUsername();
			String pass = usuariolog.getPass();
			List<Usuarios> users = repositorio.findByusername(username);

			for (Usuarios usuario : users) {
				if (usuario.getUsername().equals(username) && usuario.getPass().equals(pass)) {
					return new Logueo(usuario.getId());
				}

			}

			return new Logueo(0L);

		} catch (Exception e) {

			throw new Exception(e.getMessage());
		}

	}

}
