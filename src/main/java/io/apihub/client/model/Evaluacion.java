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
import io.apihub.client.model.EvaluacionDatosCandidato;
import io.apihub.client.model.EvaluacionPerfil;
import io.apihub.client.model.EvaluacionVariablesGlobales;
import io.apihub.client.model.EvaluacionVariablesLocales;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Evaluacion {
  @SerializedName("nombreEvaluacion")
  private String nombreEvaluacion = null;

  @SerializedName("fechaAplicacion")
  private String fechaAplicacion = null;

  @SerializedName("folioAplicacion")
  private Long folioAplicacion = null;

  @SerializedName("tiempoRespuesta")
  private String tiempoRespuesta = null;

  @SerializedName("datosCandidato")
  private EvaluacionDatosCandidato datosCandidato = null;

  @SerializedName("perfil")
  private EvaluacionPerfil perfil = null;

  @SerializedName("variablesGlobales")
  private EvaluacionVariablesGlobales variablesGlobales = null;

  @SerializedName("variablesLocales")
  private EvaluacionVariablesLocales variablesLocales = null;

  public Evaluacion nombreEvaluacion(String nombreEvaluacion) {
    this.nombreEvaluacion = nombreEvaluacion;
    return this;
  }

  @ApiModelProperty(example = "ÍNDICE GENERAL DE HONESTIDAD", value = "Evaluación que respondió el candidato")
  public String getNombreEvaluacion() {
    return nombreEvaluacion;
  }

  public void setNombreEvaluacion(String nombreEvaluacion) {
    this.nombreEvaluacion = nombreEvaluacion;
  }

  public Evaluacion fechaAplicacion(String fechaAplicacion) {
    this.fechaAplicacion = fechaAplicacion;
    return this;
  }

  @ApiModelProperty(example = "2019-09-05T17:32:28Z", value = "Indica la fecha y hora en la que fue respondida la evaluación")
  public String getFechaAplicacion() {
    return fechaAplicacion;
  }

  public void setFechaAplicacion(String fechaAplicacion) {
    this.fechaAplicacion = fechaAplicacion;
  }

  public Evaluacion folioAplicacion(Long folioAplicacion) {
    this.folioAplicacion = folioAplicacion;
    return this;
  }

  @ApiModelProperty(example = "1065320019883", value = "Número que identifica y diferencia cada una de las aplicaciones realizadas.")
  public Long getFolioAplicacion() {
    return folioAplicacion;
  }

  public void setFolioAplicacion(Long folioAplicacion) {
    this.folioAplicacion = folioAplicacion;
  }

  public Evaluacion tiempoRespuesta(String tiempoRespuesta) {
    this.tiempoRespuesta = tiempoRespuesta;
    return this;
  }

  @ApiModelProperty(example = "0h 25m", value = "Lapso que el candidato ocupó para resolver la evaluación.")
  public String getTiempoRespuesta() {
    return tiempoRespuesta;
  }

  public void setTiempoRespuesta(String tiempoRespuesta) {
    this.tiempoRespuesta = tiempoRespuesta;
  }

  public Evaluacion datosCandidato(EvaluacionDatosCandidato datosCandidato) {
    this.datosCandidato = datosCandidato;
    return this;
  }

  @ApiModelProperty(value = "")
  public EvaluacionDatosCandidato getDatosCandidato() {
    return datosCandidato;
  }

  public void setDatosCandidato(EvaluacionDatosCandidato datosCandidato) {
    this.datosCandidato = datosCandidato;
  }

  public Evaluacion perfil(EvaluacionPerfil perfil) {
    this.perfil = perfil;
    return this;
  }

  @ApiModelProperty(value = "")
  public EvaluacionPerfil getPerfil() {
    return perfil;
  }

  public void setPerfil(EvaluacionPerfil perfil) {
    this.perfil = perfil;
  }

  public Evaluacion variablesGlobales(EvaluacionVariablesGlobales variablesGlobales) {
    this.variablesGlobales = variablesGlobales;
    return this;
  }

  @ApiModelProperty(value = "")
  public EvaluacionVariablesGlobales getVariablesGlobales() {
    return variablesGlobales;
  }

  public void setVariablesGlobales(EvaluacionVariablesGlobales variablesGlobales) {
    this.variablesGlobales = variablesGlobales;
  }

  public Evaluacion variablesLocales(EvaluacionVariablesLocales variablesLocales) {
    this.variablesLocales = variablesLocales;
    return this;
  }

  @ApiModelProperty(value = "")
  public EvaluacionVariablesLocales getVariablesLocales() {
    return variablesLocales;
  }

  public void setVariablesLocales(EvaluacionVariablesLocales variablesLocales) {
    this.variablesLocales = variablesLocales;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Evaluacion evaluacion = (Evaluacion) o;
    return Objects.equals(this.nombreEvaluacion, evaluacion.nombreEvaluacion) &&
        Objects.equals(this.fechaAplicacion, evaluacion.fechaAplicacion) &&
        Objects.equals(this.folioAplicacion, evaluacion.folioAplicacion) &&
        Objects.equals(this.tiempoRespuesta, evaluacion.tiempoRespuesta) &&
        Objects.equals(this.datosCandidato, evaluacion.datosCandidato) &&
        Objects.equals(this.perfil, evaluacion.perfil) &&
        Objects.equals(this.variablesGlobales, evaluacion.variablesGlobales) &&
        Objects.equals(this.variablesLocales, evaluacion.variablesLocales);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nombreEvaluacion, fechaAplicacion, folioAplicacion, tiempoRespuesta, datosCandidato, perfil, variablesGlobales, variablesLocales);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Evaluacion {\n");
    
    sb.append("    nombreEvaluacion: ").append(toIndentedString(nombreEvaluacion)).append("\n");
    sb.append("    fechaAplicacion: ").append(toIndentedString(fechaAplicacion)).append("\n");
    sb.append("    folioAplicacion: ").append(toIndentedString(folioAplicacion)).append("\n");
    sb.append("    tiempoRespuesta: ").append(toIndentedString(tiempoRespuesta)).append("\n");
    sb.append("    datosCandidato: ").append(toIndentedString(datosCandidato)).append("\n");
    sb.append("    perfil: ").append(toIndentedString(perfil)).append("\n");
    sb.append("    variablesGlobales: ").append(toIndentedString(variablesGlobales)).append("\n");
    sb.append("    variablesLocales: ").append(toIndentedString(variablesLocales)).append("\n");
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

