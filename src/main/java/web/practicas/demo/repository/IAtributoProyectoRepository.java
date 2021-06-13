package web.practicas.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import web.practicas.demo.model.entidades.Atributo_Proyecto;
import web.practicas.demo.model.entidades.Key;

public interface IAtributoProyectoRepository extends JpaRepository<Atributo_Proyecto, Key> {
}
