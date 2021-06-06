package web.practicas.demo.repository;
import java.util.List;


import org.springframework.stereotype.Repository;

import web.practicas.demo.model.Usuarios;
@Repository
public interface UsuarioRepository  extends BaseRepository<Usuarios, Long>{
	List<Usuarios>findByemail(String email)throws Exception;
	List<Usuarios>findByusername(String username)throws Exception;
	

}
