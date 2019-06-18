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

public class EvaluacionVariablesLocales {
  @SerializedName("variables")
  private List<Variables> variables = null;

  public EvaluacionVariablesLocales variables(List<Variables> variables) {
    this.variables = variables;
    return this;
  }

  public EvaluacionVariablesLocales addVariablesItem(Variables variablesItem) {
    if (this.variables == null) {
      this.variables = new ArrayList<Variables>();
    }
    this.variables.add(variablesItem);
    return this;
  }

  @ApiModelProperty(value = "")
  public List<Variables> getVariables() {
    return variables;
  }

  public void setVariables(List<Variables> variables) {
    this.variables = variables;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvaluacionVariablesLocales evaluacionVariablesLocales = (EvaluacionVariablesLocales) o;
    return Objects.equals(this.variables, evaluacionVariablesLocales.variables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(variables);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluacionVariablesLocales {\n");
    
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
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