package web.practicas.demo.service.auxiliar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.practicas.demo.model.dto.AtributoDto;
import web.practicas.demo.model.entidades.Atributo;
import web.practicas.demo.model.entidades.Atributo_Proyecto;
import web.practicas.demo.model.entidades.Proyecto;
import web.practicas.demo.repository.IAtributoRepository;
import web.practicas.demo.repository.IProyectoRepository;

@Service
public class AuxService {

    @Autowired
    private static IAtributoRepository repositorioAtributo;

    public static String dimetipodato(String nombreatributo) {
        Atributo temporal = repositorioAtributo.findByNombreAtributo(nombreatributo);
        return temporal.getTipoDato();
    }

    public static Atributo_Proyecto asignarcampo_valor(Proyecto proyecto_guardar, AtributoDto entidad) {
        /*datos atributo*/

        String nombreatributo = entidad.getNombreAtributo();
        System.out.println(nombreatributo);
        Atributo atributocompleto=repositorioAtributo.findByNombreAtributo(nombreatributo);
        System.out.println("consigo el atributo");
        String valor = entidad.getValor();
        String tipoDato = AuxService.dimetipodato(nombreatributo);
        System.out.println("me dice el tipo de dato");/*instancia relacion voy a guardar*/
return new Atributo_Proyecto();
    }


}
