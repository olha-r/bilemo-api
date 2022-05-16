/*
 * 
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

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

/**
 * InlineResponse200HydraSearchHydraMapping
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-16T12:37:07.162192+02:00[Europe/Paris]")
public class InlineResponse200HydraSearchHydraMapping {
  public static final String SERIALIZED_NAME_AT_TYPE = "@type";
  @SerializedName(SERIALIZED_NAME_AT_TYPE)
  private String atType;

  public static final String SERIALIZED_NAME_VARIABLE = "variable";
  @SerializedName(SERIALIZED_NAME_VARIABLE)
  private String variable;

  public static final String SERIALIZED_NAME_PROPERTY = "property";
  @SerializedName(SERIALIZED_NAME_PROPERTY)
  private String property;

  public static final String SERIALIZED_NAME_REQUIRED = "required";
  @SerializedName(SERIALIZED_NAME_REQUIRED)
  private Boolean required;


  public InlineResponse200HydraSearchHydraMapping atType(String atType) {
    
    this.atType = atType;
    return this;
  }

   /**
   * Get atType
   * @return atType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAtType() {
    return atType;
  }


  public void setAtType(String atType) {
    this.atType = atType;
  }


  public InlineResponse200HydraSearchHydraMapping variable(String variable) {
    
    this.variable = variable;
    return this;
  }

   /**
   * Get variable
   * @return variable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVariable() {
    return variable;
  }


  public void setVariable(String variable) {
    this.variable = variable;
  }


  public InlineResponse200HydraSearchHydraMapping property(String property) {
    
    this.property = property;
    return this;
  }

   /**
   * Get property
   * @return property
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProperty() {
    return property;
  }


  public void setProperty(String property) {
    this.property = property;
  }


  public InlineResponse200HydraSearchHydraMapping required(Boolean required) {
    
    this.required = required;
    return this;
  }

   /**
   * Get required
   * @return required
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getRequired() {
    return required;
  }


  public void setRequired(Boolean required) {
    this.required = required;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200HydraSearchHydraMapping inlineResponse200HydraSearchHydraMapping = (InlineResponse200HydraSearchHydraMapping) o;
    return Objects.equals(this.atType, inlineResponse200HydraSearchHydraMapping.atType) &&
        Objects.equals(this.variable, inlineResponse200HydraSearchHydraMapping.variable) &&
        Objects.equals(this.property, inlineResponse200HydraSearchHydraMapping.property) &&
        Objects.equals(this.required, inlineResponse200HydraSearchHydraMapping.required);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atType, variable, property, required);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200HydraSearchHydraMapping {\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    variable: ").append(toIndentedString(variable)).append("\n");
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

