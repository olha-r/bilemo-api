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
 * InlineResponse200HydraView
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-16T12:37:07.162192+02:00[Europe/Paris]")
public class InlineResponse200HydraView {
  public static final String SERIALIZED_NAME_AT_ID = "@id";
  @SerializedName(SERIALIZED_NAME_AT_ID)
  private String atId;

  public static final String SERIALIZED_NAME_AT_TYPE = "@type";
  @SerializedName(SERIALIZED_NAME_AT_TYPE)
  private String atType;

  public static final String SERIALIZED_NAME_HYDRA_COLON_FIRST = "hydra:first";
  @SerializedName(SERIALIZED_NAME_HYDRA_COLON_FIRST)
  private String hydraColonFirst;

  public static final String SERIALIZED_NAME_HYDRA_COLON_LAST = "hydra:last";
  @SerializedName(SERIALIZED_NAME_HYDRA_COLON_LAST)
  private String hydraColonLast;

  public static final String SERIALIZED_NAME_HYDRA_COLON_PREVIOUS = "hydra:previous";
  @SerializedName(SERIALIZED_NAME_HYDRA_COLON_PREVIOUS)
  private String hydraColonPrevious;

  public static final String SERIALIZED_NAME_HYDRA_COLON_NEXT = "hydra:next";
  @SerializedName(SERIALIZED_NAME_HYDRA_COLON_NEXT)
  private String hydraColonNext;


  public InlineResponse200HydraView atId(String atId) {
    
    this.atId = atId;
    return this;
  }

   /**
   * Get atId
   * @return atId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAtId() {
    return atId;
  }


  public void setAtId(String atId) {
    this.atId = atId;
  }


  public InlineResponse200HydraView atType(String atType) {
    
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


  public InlineResponse200HydraView hydraColonFirst(String hydraColonFirst) {
    
    this.hydraColonFirst = hydraColonFirst;
    return this;
  }

   /**
   * Get hydraColonFirst
   * @return hydraColonFirst
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHydraColonFirst() {
    return hydraColonFirst;
  }


  public void setHydraColonFirst(String hydraColonFirst) {
    this.hydraColonFirst = hydraColonFirst;
  }


  public InlineResponse200HydraView hydraColonLast(String hydraColonLast) {
    
    this.hydraColonLast = hydraColonLast;
    return this;
  }

   /**
   * Get hydraColonLast
   * @return hydraColonLast
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHydraColonLast() {
    return hydraColonLast;
  }


  public void setHydraColonLast(String hydraColonLast) {
    this.hydraColonLast = hydraColonLast;
  }


  public InlineResponse200HydraView hydraColonPrevious(String hydraColonPrevious) {
    
    this.hydraColonPrevious = hydraColonPrevious;
    return this;
  }

   /**
   * Get hydraColonPrevious
   * @return hydraColonPrevious
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHydraColonPrevious() {
    return hydraColonPrevious;
  }


  public void setHydraColonPrevious(String hydraColonPrevious) {
    this.hydraColonPrevious = hydraColonPrevious;
  }


  public InlineResponse200HydraView hydraColonNext(String hydraColonNext) {
    
    this.hydraColonNext = hydraColonNext;
    return this;
  }

   /**
   * Get hydraColonNext
   * @return hydraColonNext
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHydraColonNext() {
    return hydraColonNext;
  }


  public void setHydraColonNext(String hydraColonNext) {
    this.hydraColonNext = hydraColonNext;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200HydraView inlineResponse200HydraView = (InlineResponse200HydraView) o;
    return Objects.equals(this.atId, inlineResponse200HydraView.atId) &&
        Objects.equals(this.atType, inlineResponse200HydraView.atType) &&
        Objects.equals(this.hydraColonFirst, inlineResponse200HydraView.hydraColonFirst) &&
        Objects.equals(this.hydraColonLast, inlineResponse200HydraView.hydraColonLast) &&
        Objects.equals(this.hydraColonPrevious, inlineResponse200HydraView.hydraColonPrevious) &&
        Objects.equals(this.hydraColonNext, inlineResponse200HydraView.hydraColonNext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atId, atType, hydraColonFirst, hydraColonLast, hydraColonPrevious, hydraColonNext);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200HydraView {\n");
    sb.append("    atId: ").append(toIndentedString(atId)).append("\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    hydraColonFirst: ").append(toIndentedString(hydraColonFirst)).append("\n");
    sb.append("    hydraColonLast: ").append(toIndentedString(hydraColonLast)).append("\n");
    sb.append("    hydraColonPrevious: ").append(toIndentedString(hydraColonPrevious)).append("\n");
    sb.append("    hydraColonNext: ").append(toIndentedString(hydraColonNext)).append("\n");
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

