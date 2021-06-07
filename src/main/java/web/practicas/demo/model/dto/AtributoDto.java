package web.practicas.demo.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


public class AtributoDto {
    @JsonProperty("idproyecto")
    private long idProyecto;
    @JsonProperty("nombreatributo")
    private String nombreAtributo;
    @JsonProperty("valor")
    private String valor;

    public AtributoDto() {
    }

    public AtributoDto(long idProyecto, String nombreAtributo, String valor) {
        this.idProyecto = idProyecto;
        this.nombreAtributo = nombreAtributo;
        this.valor = valor;
    }

    public long getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(long idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getNombreAtributo() {
        return nombreAtributo;
    }

    public void setNombreAtributo(String nombreAtributo) {
        this.nombreAtributo = nombreAtributo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
