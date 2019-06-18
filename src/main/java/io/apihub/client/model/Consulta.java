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

public class Consulta {
  @SerializedName("fechaInicial")
  private String fechaInicial = null;

  @SerializedName("fechaFinal")
  private String fechaFinal = null;

  @SerializedName("correoElectronico")
  private String correoElectronico = null;

  @SerializedName("folioEmpresa")
  private String folioEmpresa = null;

  public Consulta fechaInicial(String fechaInicial) {
    this.fechaInicial = fechaInicial;
    return this;
  }

  @ApiModelProperty(example = "2014-05-14", required = true, value = "")
  public String getFechaInicial() {
    return fechaInicial;
  }

  public void setFechaInicial(String fechaInicial) {
    this.fechaInicial = fechaInicial;
  }

  public Consulta fechaFinal(String fechaFinal) {
    this.fechaFinal = fechaFinal;
    return this;
  }

  @ApiModelProperty(example = "2014-05-20", required = true, value = "")
  public String getFechaFinal() {
    return fechaFinal;
  }

  public void setFechaFinal(String fechaFinal) {
    this.fechaFinal = fechaFinal;
  }

  public Consulta correoElectronico(String correoElectronico) {
    this.correoElectronico = correoElectronico;
    return this;
  }

  @ApiModelProperty(example = "demoEva@mail.com.mx", required = true, value = "")
  public String getCorreoElectronico() {
    return correoElectronico;
  }

  public void setCorreoElectronico(String correoElectronico) {
    this.correoElectronico = correoElectronico;
  }

  public Consulta folioEmpresa(String folioEmpresa) {
    this.folioEmpresa = folioEmpresa;
    return this;
  }

  @ApiModelProperty(example = "DEMO0893", value = "")
  public String getFolioEmpresa() {
    return folioEmpresa;
  }

  public void setFolioEmpresa(String folioEmpresa) {
    this.folioEmpresa = folioEmpresa;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Consulta consulta = (Consulta) o;
    return Objects.equals(this.fechaInicial, consulta.fechaInicial) &&
        Objects.equals(this.fechaFinal, consulta.fechaFinal) &&
        Objects.equals(this.correoElectronico, consulta.correoElectronico) &&
        Objects.equals(this.folioEmpresa, consulta.folioEmpresa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fechaInicial, fechaFinal, correoElectronico, folioEmpresa);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Consulta {\n");
    
    sb.append("    fechaInicial: ").append(toIndentedString(fechaInicial)).append("\n");
    sb.append("    fechaFinal: ").append(toIndentedString(fechaFinal)).append("\n");
    sb.append("    correoElectronico: ").append(toIndentedString(correoElectronico)).append("\n");
    sb.append("    folioEmpresa: ").append(toIndentedString(folioEmpresa)).append("\n");
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

