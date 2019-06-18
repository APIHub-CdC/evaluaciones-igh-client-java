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
import io.apihub.client.model.Variables;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@ApiModel(description = "por definir")
public class EvaluacionVariablesGlobales {
  @SerializedName("personalizadas")
  private List<Variables> personalizadas = null;

  @SerializedName("noPersonalizadas")
  private List<Variables> noPersonalizadas = null;

  public EvaluacionVariablesGlobales personalizadas(List<Variables> personalizadas) {
    this.personalizadas = personalizadas;
    return this;
  }

  public EvaluacionVariablesGlobales addPersonalizadasItem(Variables personalizadasItem) {
    if (this.personalizadas == null) {
      this.personalizadas = new ArrayList<Variables>();
    }
    this.personalizadas.add(personalizadasItem);
    return this;
  }

  @ApiModelProperty(value = "")
  public List<Variables> getPersonalizadas() {
    return personalizadas;
  }

  public void setPersonalizadas(List<Variables> personalizadas) {
    this.personalizadas = personalizadas;
  }

  public EvaluacionVariablesGlobales noPersonalizadas(List<Variables> noPersonalizadas) {
    this.noPersonalizadas = noPersonalizadas;
    return this;
  }

  public EvaluacionVariablesGlobales addNoPersonalizadasItem(Variables noPersonalizadasItem) {
    if (this.noPersonalizadas == null) {
      this.noPersonalizadas = new ArrayList<Variables>();
    }
    this.noPersonalizadas.add(noPersonalizadasItem);
    return this;
  }

  @ApiModelProperty(value = "")
  public List<Variables> getNoPersonalizadas() {
    return noPersonalizadas;
  }

  public void setNoPersonalizadas(List<Variables> noPersonalizadas) {
    this.noPersonalizadas = noPersonalizadas;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvaluacionVariablesGlobales evaluacionVariablesGlobales = (EvaluacionVariablesGlobales) o;
    return Objects.equals(this.personalizadas, evaluacionVariablesGlobales.personalizadas) &&
        Objects.equals(this.noPersonalizadas, evaluacionVariablesGlobales.noPersonalizadas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personalizadas, noPersonalizadas);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluacionVariablesGlobales {\n");
    
    sb.append("    personalizadas: ").append(toIndentedString(personalizadas)).append("\n");
    sb.append("    noPersonalizadas: ").append(toIndentedString(noPersonalizadas)).append("\n");
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

