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
import io.apihub.client.model.EvaluacionDatosCandidatoDomicilio;
import java.io.IOException;
import org.threeten.bp.LocalDate;


public class EvaluacionDatosCandidato {
  @SerializedName("nombreCompleto")
  private String nombreCompleto = null;

  @SerializedName("sexo")
  private String sexo = null;

  @SerializedName("fechaNacimiento")
  private LocalDate fechaNacimiento = null;

  @SerializedName("correoElectronico")
  private String correoElectronico = null;

  @SerializedName("domicilio")
  private EvaluacionDatosCandidatoDomicilio domicilio = null;

  public EvaluacionDatosCandidato nombreCompleto(String nombreCompleto) {
    this.nombreCompleto = nombreCompleto;
    return this;
  }

  @ApiModelProperty(example = "MARIANA SUAREZ SUAREZ", value = "Nombre completo del candidato.")
  public String getNombreCompleto() {
    return nombreCompleto;
  }

  public void setNombreCompleto(String nombreCompleto) {
    this.nombreCompleto = nombreCompleto;
  }

  public EvaluacionDatosCandidato sexo(String sexo) {
    this.sexo = sexo;
    return this;
  }

  @ApiModelProperty(example = "HOMBRE", value = "Condición orgánica que distingue a los hombres de las mujeres.")
  public String getSexo() {
    return sexo;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  public EvaluacionDatosCandidato fechaNacimiento(LocalDate fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
    return this;
  }

  @ApiModelProperty(example = "2018-10-18T00:00:00.000Z", value = "Fecha de nacimiento")
  public LocalDate getFechaNacimiento() {
    return fechaNacimiento;
  }

  public void setFechaNacimiento(LocalDate fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
  }

  public EvaluacionDatosCandidato correoElectronico(String correoElectronico) {
    this.correoElectronico = correoElectronico;
    return this;
  }

  @ApiModelProperty(example = "demoEva@mail.com.mx", value = "Servicio que permite el intercambio de mensajes a través de sistemas de comunicación electrónicos.")
  public String getCorreoElectronico() {
    return correoElectronico;
  }

  public void setCorreoElectronico(String correoElectronico) {
    this.correoElectronico = correoElectronico;
  }

  public EvaluacionDatosCandidato domicilio(EvaluacionDatosCandidatoDomicilio domicilio) {
    this.domicilio = domicilio;
    return this;
  }

  @ApiModelProperty(value = "")
  public EvaluacionDatosCandidatoDomicilio getDomicilio() {
    return domicilio;
  }

  public void setDomicilio(EvaluacionDatosCandidatoDomicilio domicilio) {
    this.domicilio = domicilio;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvaluacionDatosCandidato evaluacionDatosCandidato = (EvaluacionDatosCandidato) o;
    return Objects.equals(this.nombreCompleto, evaluacionDatosCandidato.nombreCompleto) &&
        Objects.equals(this.sexo, evaluacionDatosCandidato.sexo) &&
        Objects.equals(this.fechaNacimiento, evaluacionDatosCandidato.fechaNacimiento) &&
        Objects.equals(this.correoElectronico, evaluacionDatosCandidato.correoElectronico) &&
        Objects.equals(this.domicilio, evaluacionDatosCandidato.domicilio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nombreCompleto, sexo, fechaNacimiento, correoElectronico, domicilio);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluacionDatosCandidato {\n");
    
    sb.append("    nombreCompleto: ").append(toIndentedString(nombreCompleto)).append("\n");
    sb.append("    sexo: ").append(toIndentedString(sexo)).append("\n");
    sb.append("    fechaNacimiento: ").append(toIndentedString(fechaNacimiento)).append("\n");
    sb.append("    correoElectronico: ").append(toIndentedString(correoElectronico)).append("\n");
    sb.append("    domicilio: ").append(toIndentedString(domicilio)).append("\n");
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

