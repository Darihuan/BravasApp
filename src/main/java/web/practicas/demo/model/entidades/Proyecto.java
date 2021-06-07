package web.practicas.demo.model.entidades;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import web.practicas.demo.model.base.Base;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "proyectos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Proyecto extends Base {

    @Column(name = "nombre")
    private String nombre;
    @Column(name = "equipo")
    private String equipo;
    @OneToMany(mappedBy ="proyecto")
    private List<Atributo_Proyecto> relaciones;

    public boolean addrelacion(Atributo_Proyecto relacion){
        Integer size=relaciones.size();
        relaciones.add(relacion);
        if(relaciones.size()==size+1){
            return true;
        }
        else{
            return false;
        }
    }
}
