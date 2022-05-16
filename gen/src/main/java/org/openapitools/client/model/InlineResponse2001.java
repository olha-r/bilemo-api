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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.InlineResponse200HydraSearch;
import org.openapitools.client.model.InlineResponse200HydraView;
import org.openapitools.client.model.UserJsonldReadUser;

/**
 * InlineResponse2001
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-16T12:37:07.162192+02:00[Europe/Paris]")
public class InlineResponse2001 {
  public static final String SERIALIZED_NAME_HYDRA_COLON_MEMBER = "hydra:member";
  @SerializedName(SERIALIZED_NAME_HYDRA_COLON_MEMBER)
  private List<UserJsonldReadUser> hydraColonMember = new ArrayList<UserJsonldReadUser>();

  public static final String SERIALIZED_NAME_HYDRA_COLON_TOTAL_ITEMS = "hydra:totalItems";
  @SerializedName(SERIALIZED_NAME_HYDRA_COLON_TOTAL_ITEMS)
  private Integer hydraColonTotalItems;

  public static final String SERIALIZED_NAME_HYDRA_COLON_VIEW = "hydra:view";
  @SerializedName(SERIALIZED_NAME_HYDRA_COLON_VIEW)
  private InlineResponse200HydraView hydraColonView;

  public static final String SERIALIZED_NAME_HYDRA_COLON_SEARCH = "hydra:search";
  @SerializedName(SERIALIZED_NAME_HYDRA_COLON_SEARCH)
  private InlineResponse200HydraSearch hydraColonSearch;


  public InlineResponse2001 hydraColonMember(List<UserJsonldReadUser> hydraColonMember) {
    
    this.hydraColonMember = hydraColonMember;
    return this;
  }

  public InlineResponse2001 addHydraColonMemberItem(UserJsonldReadUser hydraColonMemberItem) {
    this.hydraColonMember.add(hydraColonMemberItem);
    return this;
  }

   /**
   * Get hydraColonMember
   * @return hydraColonMember
  **/
  @ApiModelProperty(required = true, value = "")

  public List<UserJsonldReadUser> getHydraColonMember() {
    return hydraColonMember;
  }


  public void setHydraColonMember(List<UserJsonldReadUser> hydraColonMember) {
    this.hydraColonMember = hydraColonMember;
  }


  public InlineResponse2001 hydraColonTotalItems(Integer hydraColonTotalItems) {
    
    this.hydraColonTotalItems = hydraColonTotalItems;
    return this;
  }

   /**
   * Get hydraColonTotalItems
   * minimum: 0
   * @return hydraColonTotalItems
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getHydraColonTotalItems() {
    return hydraColonTotalItems;
  }


  public void setHydraColonTotalItems(Integer hydraColonTotalItems) {
    this.hydraColonTotalItems = hydraColonTotalItems;
  }


  public InlineResponse2001 hydraColonView(InlineResponse200HydraView hydraColonView) {
    
    this.hydraColonView = hydraColonView;
    return this;
  }

   /**
   * Get hydraColonView
   * @return hydraColonView
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InlineResponse200HydraView getHydraColonView() {
    return hydraColonView;
  }


  public void setHydraColonView(InlineResponse200HydraView hydraColonView) {
    this.hydraColonView = hydraColonView;
  }


  public InlineResponse2001 hydraColonSearch(InlineResponse200HydraSearch hydraColonSearch) {
    
    this.hydraColonSearch = hydraColonSearch;
    return this;
  }

   /**
   * Get hydraColonSearch
   * @return hydraColonSearch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InlineResponse200HydraSearch getHydraColonSearch() {
    return hydraColonSearch;
  }


  public void setHydraColonSearch(InlineResponse200HydraSearch hydraColonSearch) {
    this.hydraColonSearch = hydraColonSearch;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2001 inlineResponse2001 = (InlineResponse2001) o;
    return Objects.equals(this.hydraColonMember, inlineResponse2001.hydraColonMember) &&
        Objects.equals(this.hydraColonTotalItems, inlineResponse2001.hydraColonTotalItems) &&
        Objects.equals(this.hydraColonView, inlineResponse2001.hydraColonView) &&
        Objects.equals(this.hydraColonSearch, inlineResponse2001.hydraColonSearch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hydraColonMember, hydraColonTotalItems, hydraColonView, hydraColonSearch);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2001 {\n");
    sb.append("    hydraColonMember: ").append(toIndentedString(hydraColonMember)).append("\n");
    sb.append("    hydraColonTotalItems: ").append(toIndentedString(hydraColonTotalItems)).append("\n");
    sb.append("    hydraColonView: ").append(toIndentedString(hydraColonView)).append("\n");
    sb.append("    hydraColonSearch: ").append(toIndentedString(hydraColonSearch)).append("\n");
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

