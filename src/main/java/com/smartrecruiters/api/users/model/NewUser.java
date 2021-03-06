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
import com.smartrecruiters.api.users.model.LocationUpdateRequest;
import com.smartrecruiters.api.users.model.NewUserAllOf;
import com.smartrecruiters.api.users.model.SystemRole;
import com.smartrecruiters.api.users.model.User;
import com.smartrecruiters.api.users.model.UserLanguage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * NewUser
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-10-29T09:49:58.273618+01:00[Europe/Rome]")
public class NewUser {
  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_SYSTEM_ROLE = "systemRole";
  @SerializedName(SERIALIZED_NAME_SYSTEM_ROLE)
  private SystemRole systemRole;

  public static final String SERIALIZED_NAME_EXTERNAL_DATA = "externalData";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_DATA)
  private String externalData;

  public static final String SERIALIZED_NAME_SSO_IDENTIFIER = "ssoIdentifier";
  @SerializedName(SERIALIZED_NAME_SSO_IDENTIFIER)
  private String ssoIdentifier;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private UserLanguage language;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private LocationUpdateRequest location;


  public NewUser email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(required = true, value = "")

  public String getEmail() {
    return email;
  }



  public void setEmail(String email) {
    this.email = email;
  }


  public NewUser firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @ApiModelProperty(required = true, value = "")

  public String getFirstName() {
    return firstName;
  }



  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public NewUser lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @ApiModelProperty(required = true, value = "")

  public String getLastName() {
    return lastName;
  }



  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public NewUser systemRole(SystemRole systemRole) {
    
    this.systemRole = systemRole;
    return this;
  }

   /**
   * Get systemRole
   * @return systemRole
  **/
  @ApiModelProperty(required = true, value = "")

  public SystemRole getSystemRole() {
    return systemRole;
  }



  public void setSystemRole(SystemRole systemRole) {
    this.systemRole = systemRole;
  }


  public NewUser externalData(String externalData) {
    
    this.externalData = externalData;
    return this;
  }

   /**
   * Get externalData
   * @return externalData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExternalData() {
    return externalData;
  }



  public void setExternalData(String externalData) {
    this.externalData = externalData;
  }


  public NewUser ssoIdentifier(String ssoIdentifier) {
    
    this.ssoIdentifier = ssoIdentifier;
    return this;
  }

   /**
   * Get ssoIdentifier
   * @return ssoIdentifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSsoIdentifier() {
    return ssoIdentifier;
  }



  public void setSsoIdentifier(String ssoIdentifier) {
    this.ssoIdentifier = ssoIdentifier;
  }


  public NewUser language(UserLanguage language) {
    
    this.language = language;
    return this;
  }

   /**
   * Get language
   * @return language
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UserLanguage getLanguage() {
    return language;
  }



  public void setLanguage(UserLanguage language) {
    this.language = language;
  }


  public NewUser password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPassword() {
    return password;
  }



  public void setPassword(String password) {
    this.password = password;
  }


  public NewUser location(LocationUpdateRequest location) {
    
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LocationUpdateRequest getLocation() {
    return location;
  }



  public void setLocation(LocationUpdateRequest location) {
    this.location = location;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewUser newUser = (NewUser) o;
    return Objects.equals(this.email, newUser.email) &&
        Objects.equals(this.firstName, newUser.firstName) &&
        Objects.equals(this.lastName, newUser.lastName) &&
        Objects.equals(this.systemRole, newUser.systemRole) &&
        Objects.equals(this.externalData, newUser.externalData) &&
        Objects.equals(this.ssoIdentifier, newUser.ssoIdentifier) &&
        Objects.equals(this.language, newUser.language) &&
        Objects.equals(this.password, newUser.password) &&
        Objects.equals(this.location, newUser.location);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, firstName, lastName, systemRole, externalData, ssoIdentifier, language, password, location);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewUser {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    systemRole: ").append(toIndentedString(systemRole)).append("\n");
    sb.append("    externalData: ").append(toIndentedString(externalData)).append("\n");
    sb.append("    ssoIdentifier: ").append(toIndentedString(ssoIdentifier)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
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

