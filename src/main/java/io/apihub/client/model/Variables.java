package io.apihub.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;


public class Variables {
  @SerializedName("indicador")
  private String indicador = null;

  @SerializedName("porcentajeObtenido")
  private Integer porcentajeObtenido = null;

  @SerializedName("semaforizacion")
  private String semaforizacion = null;

  @SerializedName("textoInterpretacion")
  private String textoInterpretacion = null;

  public Variables indicador(String indicador) {
    this.indicador = indicador;
    return this;
  }

  @ApiModelProperty(example = "Inevitabilidad", value = "Por definir.")
  public String getIndicador() {
    return indicador;
  }

  public void setIndicador(String indicador) {
    this.indicador = indicador;
  }

  public Variables porcentajeObtenido(Integer porcentajeObtenido) {
    this.porcentajeObtenido = porcentajeObtenido;
    return this;
  }

  @ApiModelProperty(example = "80", value = "Por definir.")
  public Integer getPorcentajeObtenido() {
    return porcentajeObtenido;
  }

  public void setPorcentajeObtenido(Integer porcentajeObtenido) {
    this.porcentajeObtenido = porcentajeObtenido;
  }

  public Variables semaforizacion(String semaforizacion) {
    this.semaforizacion = semaforizacion;
    return this;
  }

  @ApiModelProperty(example = "Verde", value = "Por definir.")
  public String getSemaforizacion() {
    return semaforizacion;
  }

  public void setSemaforizacion(String semaforizacion) {
    this.semaforizacion = semaforizacion;
  }

  public Variables textoInterpretacion(String textoInterpretacion) {
    this.textoInterpretacion = textoInterpretacion;
    return this;
  }

  @ApiModelProperty(example = "Prueba demo de texo de interpretación", value = "Por definir.")
  public String getTextoInterpretacion() {
    return textoInterpretacion;
  }

  public void setTextoInterpretacion(String textoInterpretacion) {
    this.textoInterpretacion = textoInterpretacion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Variables variables = (Variables) o;
    return Objects.equals(this.indicador, variables.indicador) &&
        Objects.equals(this.porcentajeObtenido, variables.porcentajeObtenido) &&
        Objects.equals(this.semaforizacion, variables.semaforizacion) &&
        Objects.equals(this.textoInterpretacion, variables.textoInterpretacion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(indicador, porcentajeObtenido, semaforizacion, textoInterpretacion);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Variables {\n");
    
    sb.append("    indicador: ").append(toIndentedString(indicador)).append("\n");
    sb.append("    porcentajeObtenido: ").append(toIndentedString(porcentajeObtenido)).append("\n");
    sb.append("    semaforizacion: ").append(toIndentedString(semaforizacion)).append("\n");
    sb.append("    textoInterpretacion: ").append(toIndentedString(textoInterpretacion)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

