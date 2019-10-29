/*
 * Users API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.smartrecruiters.api.users.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartrecruiters.api.users.model.Location;
import com.smartrecruiters.api.users.model.UserEntityAllOfAccessGroups;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * UserEntityAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-10-29T09:49:58.273618+01:00[Europe/Rome]")
public class UserEntityAllOf {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  public static final String SERIALIZED_NAME_UPDATED_ON = "updatedOn";
  @SerializedName(SERIALIZED_NAME_UPDATED_ON)
  private OffsetDateTime updatedOn;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private Location location;

  public static final String SERIALIZED_NAME_ACCESS_GROUPS = "accessGroups";
  @SerializedName(SERIALIZED_NAME_ACCESS_GROUPS)
  private List<UserEntityAllOfAccessGroups> accessGroups = null;


  public UserEntityAllOf id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }



  public void setId(String id) {
    this.id = id;
  }


  public UserEntityAllOf active(Boolean active) {
    
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getActive() {
    return active;
  }



  public void setActive(Boolean active) {
    this.active = active;
  }


  public UserEntityAllOf updatedOn(OffsetDateTime updatedOn) {
    
    this.updatedOn = updatedOn;
    return this;
  }

   /**
   * Get updatedOn
   * @return updatedOn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getUpdatedOn() {
    return updatedOn;
  }



  public void setUpdatedOn(OffsetDateTime updatedOn) {
    this.updatedOn = updatedOn;
  }


  public UserEntityAllOf location(Location location) {
    
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Location getLocation() {
    return location;
  }



  public void setLocation(Location location) {
    this.location = location;
  }


  public UserEntityAllOf accessGroups(List<UserEntityAllOfAccessGroups> accessGroups) {
    
    this.accessGroups = accessGroups;
    return this;
  }

  public UserEntityAllOf addAccessGroupsItem(UserEntityAllOfAccessGroups accessGroupsItem) {
    if (this.accessGroups == null) {
      this.accessGroups = new ArrayList<UserEntityAllOfAccessGroups>();
    }
    this.accessGroups.add(accessGroupsItem);
    return this;
  }

   /**
   * Get accessGroups
   * @return accessGroups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserEntityAllOfAccessGroups> getAccessGroups() {
    return accessGroups;
  }



  public void setAccessGroups(List<UserEntityAllOfAccessGroups> accessGroups) {
    this.accessGroups = accessGroups;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserEntityAllOf userEntityAllOf = (UserEntityAllOf) o;
    return Objects.equals(this.id, userEntityAllOf.id) &&
        Objects.equals(this.active, userEntityAllOf.active) &&
        Objects.equals(this.updatedOn, userEntityAllOf.updatedOn) &&
        Objects.equals(this.location, userEntityAllOf.location) &&
        Objects.equals(this.accessGroups, userEntityAllOf.accessGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, updatedOn, location, accessGroups);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserEntityAllOf {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    updatedOn: ").append(toIndentedString(updatedOn)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    accessGroups: ").append(toIndentedString(accessGroups)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
