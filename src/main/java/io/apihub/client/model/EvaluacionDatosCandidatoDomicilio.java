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

public class EvaluacionDatosCandidatoDomicilio {
  @SerializedName("calle")
  private String calle = null;

  @SerializedName("colonia")
  private String colonia = null;

  @SerializedName("codigoPostal")
  private String codigoPostal = null;

  @SerializedName("ciudad")
  private String ciudad = null;

  @SerializedName("delegacion")
  private String delegacion = null;

  @SerializedName("estado")
  private String estado = null;

  public EvaluacionDatosCandidatoDomicilio calle(String calle) {
    this.calle = calle;
    return this;
  }

  @ApiModelProperty(example = "CALLE PRINICPAL", value = "Nombre de la calle, número exterior o interior. Deben considerarse avenida, cerrada, manzana y lote. ")
  public String getCalle() {
    return calle;
  }

  public void setCalle(String calle) {
    this.calle = calle;
  }

  public EvaluacionDatosCandidatoDomicilio colonia(String colonia) {
    this.colonia = colonia;
    return this;
  }

  @ApiModelProperty(example = "COLONIA PRINICPAL", value = "Subdivisión de las alcaldías o municipios a la cual pertenece el domicilio del candidato.")
  public String getColonia() {
    return colonia;
  }

  public void setColonia(String colonia) {
    this.colonia = colonia;
  }

  public EvaluacionDatosCandidatoDomicilio codigoPostal(String codigoPostal) {
    this.codigoPostal = codigoPostal;
    return this;
  }

  @ApiModelProperty(example = "05110", value = "Combinación de números que se asigna a una población.")
  public String getCodigoPostal() {
    return codigoPostal;
  }

  public void setCodigoPostal(String codigoPostal) {
    this.codigoPostal = codigoPostal;
  }

  public EvaluacionDatosCandidatoDomicilio ciudad(String ciudad) {
    this.ciudad = ciudad;
    return this;
  }

  @ApiModelProperty(example = "CIUDAD DE MEXICO", value = "Ciudad a la cual pertenece el domicilio del candidato.")
  public String getCiudad() {
    return ciudad;
  }

  public void setCiudad(String ciudad) {
    this.ciudad = ciudad;
  }

  public EvaluacionDatosCandidatoDomicilio delegacion(String delegacion) {
    this.delegacion = delegacion;
    return this;
  }

  @ApiModelProperty(example = "CUAJIMALPA DE MORELOS", value = "Subdivisión del estado a la cual pertenece el domicilio de la persona.")
  public String getDelegacion() {
    return delegacion;
  }

  public void setDelegacion(String delegacion) {
    this.delegacion = delegacion;
  }

  public EvaluacionDatosCandidatoDomicilio estado(String estado) {
    this.estado = estado;
    return this;
  }

  @ApiModelProperty(example = "CIUDAD DE MEXICO", value = "Nombre propio que identifica la entidad federativa a la cual pertenece el domicilio del candidato.")
  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvaluacionDatosCandidatoDomicilio evaluacionDatosCandidatoDomicilio = (EvaluacionDatosCandidatoDomicilio) o;
    return Objects.equals(this.calle, evaluacionDatosCandidatoDomicilio.calle) &&
        Objects.equals(this.colonia, evaluacionDatosCandidatoDomicilio.colonia) &&
        Objects.equals(this.codigoPostal, evaluacionDatosCandidatoDomicilio.codigoPostal) &&
        Objects.equals(this.ciudad, evaluacionDatosCandidatoDomicilio.ciudad) &&
        Objects.equals(this.delegacion, evaluacionDatosCandidatoDomicilio.delegacion) &&
        Objects.equals(this.estado, evaluacionDatosCandidatoDomicilio.estado);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calle, colonia, codigoPostal, ciudad, delegacion, estado);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluacionDatosCandidatoDomicilio {\n");
    
    sb.append("    calle: ").append(toIndentedString(calle)).append("\n");
    sb.append("    colonia: ").append(toIndentedString(colonia)).append("\n");
    sb.append("    codigoPostal: ").append(toIndentedString(codigoPostal)).append("\n");
    sb.append("    ciudad: ").append(toIndentedString(ciudad)).append("\n");
    sb.append("    delegacion: ").append(toIndentedString(delegacion)).append("\n");
    sb.append("    estado: ").append(toIndentedString(estado)).append("\n");
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

