package web.practicas.demo.model.entidades;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "atributo_proyectos")
@Getter
@Setter
@NoArgsConstructor
@Embeddable
@IdClass()
public class Atributo_Proyecto implements Serializable {
    @Column(name = "value_numero")
    Integer valuenumero;
    @Column(name = "value_string")
    String valueString;
    @Column(name = "value_fecha")
    Date valueFecha;
    @Id
    @ManyToOne
@JoinColumn(name = "nombre_atributo")
    private Atributo atributo;
    @Id
    @ManyToOne
@JoinColumn(name = "id_proyecto")
    private Proyecto proyecto;

    public Atributo_Proyecto(Proyecto proyecto,Atributo atributo,Integer valuenumero, String valueString, Date valueFecha) {
        this.valuenumero = valuenumero;
        this.valueString = valueString;
        this.valueFecha = valueFecha;
        this.atributo = atributo;
        this.proyecto = proyecto;
    }


}
