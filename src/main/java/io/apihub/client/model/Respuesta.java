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
import io.apihub.client.model.Evaluacion;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@ApiModel(description = "Si existen evaluaciones se enlistarán")
public class Respuesta {
  @SerializedName("evaluaciones")
  private List<Evaluacion> evaluaciones =  new ArrayList<Evaluacion>();;

  public Respuesta evaluaciones(List<Evaluacion> evaluaciones) {
    this.evaluaciones = evaluaciones;
    return this;
  }

  public Respuesta addEvalucionesItem(Evaluacion evaluacionesItem) {
    if (this.evaluaciones == null) {
      this.evaluaciones = new ArrayList<Evaluacion>();
    }
    this.evaluaciones.add(evaluacionesItem);
    return this;
  }

  @ApiModelProperty(value = "")
  public List<Evaluacion> getEvaluciones() {
    return evaluaciones;
  }

  public void setEvaluciones(List<Evaluacion> evaluaciones) {
    this.evaluaciones = evaluaciones;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Respuesta respuesta = (Respuesta) o;
    return Objects.equals(this.evaluaciones, respuesta.evaluaciones);
  }

  @Override
  public int hashCode() {
    return Objects.hash(evaluaciones);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Respuesta {\n");
    
    sb.append("    evaluaciones: ").append(toIndentedString(evaluaciones)).append("\n");
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