package web.practicas.demo.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
@Entity
public class Atributo_Proyecto implements Serializable {
   @Id
    @ManyToOne
    private Atributo atributo;
    @Id
    @ManyToOne
    private Proyecto proyecto;

    Integer valuenumero;
    String valueString;
    Date valueFecha;



}
