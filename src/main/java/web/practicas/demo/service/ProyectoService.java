package web.practicas.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.practicas.demo.model.dto.AtributoDto;
import web.practicas.demo.model.entidades.Atributo_Proyecto;
import web.practicas.demo.model.entidades.Proyecto;
import web.practicas.demo.repository.IAtributoRepository;
import web.practicas.demo.repository.IProyectoRepository;
import web.practicas.demo.repository.base.BaseRepository;
import web.practicas.demo.service.auxiliar.AuxService;
import web.practicas.demo.service.base.BaseServiceImplementation;

@Service
public class ProyectoService extends BaseServiceImplementation<Proyecto, Long> {
    @Autowired
    IProyectoRepository repositorio;
    @Autowired
    IAtributoRepository repositorioatributo;

    public ProyectoService(BaseRepository<Proyecto, Long> repository, IProyectoRepository repositorio) {
        super(repository);
    }

    public Atributo_Proyecto addatributo_proyecto(Long id, AtributoDto entidad) throws Exception {

        try {
            System.out.println("entra en el metodo");
            Proyecto temporal = repositorio.getById(id);
            /*datos proyecto*/
            Long idproyecto = entidad.getIdProyecto();
            Proyecto proyecto_guardar = repositorio.getById(idproyecto);

            /*instancia relacion voy a guardar*/
            Atributo_Proyecto guardar = AuxService.asignarcampo_valor(proyecto_guardar, entidad);

            proyecto_guardar.addrelacion(guardar);
            repositorio.save(proyecto_guardar);

            return guardar;

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }


}
