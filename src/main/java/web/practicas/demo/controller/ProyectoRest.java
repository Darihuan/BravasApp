package web.practicas.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import web.practicas.demo.controller.base.BaseControllerImplementation;
import web.practicas.demo.model.dto.AtributoDto;
import web.practicas.demo.model.entidades.Proyecto;
import web.practicas.demo.service.ProyectoService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/api/v01/proyectos/")
public class ProyectoRest extends BaseControllerImplementation<Proyecto, ProyectoService> {
    @Autowired
    ProyectoService service;

    public ProyectoRest(ProyectoService service) {
        super(service);
        this.service = service;
    }

    @PostMapping("/atributo/{id}")
    public ResponseEntity<?> addatributo_proyecto(@PathVariable Long id, @RequestBody AtributoDto entidad) throws Exception {
        try {
           
            return ResponseEntity.status(HttpStatus.OK).body(service.addatributo_proyecto(id, entidad));

        } catch (Exception e) {

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{'Error':'peticion incorrecta'}");
        }
    }
}
