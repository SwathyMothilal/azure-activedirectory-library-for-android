/*
 * KeyVaultClient
 * The key vault client performs cryptographic key operations and vault operations against the Key Vault service.
 *
 * OpenAPI spec version: 2016-10-01
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.microsoft.identity.internal.test.keyvault.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.HashMap;
import java.util.Map;

/**
 * The key import parameters.
 */
@ApiModel(description = "The key import parameters.")

public class KeyImportParameters {
  @SerializedName("Hsm")
  private Boolean hsm = null;

  @SerializedName("key")
  private JsonWebKey key = null;

  @SerializedName("attributes")
  private KeyAttributes attributes = null;

  @SerializedName("tags")
  private Map<String, String> tags = null;

  public KeyImportParameters hsm(Boolean hsm) {
    this.hsm = hsm;
    return this;
  }

   /**
   * Whether to import as a hardware key (HSM) or software key.
   * @return hsm
  **/
  @ApiModelProperty(value = "Whether to import as a hardware key (HSM) or software key.")
  public Boolean isHsm() {
    return hsm;
  }

  public void setHsm(Boolean hsm) {
    this.hsm = hsm;
  }

  public KeyImportParameters key(JsonWebKey key) {
    this.key = key;
    return this;
  }

   /**
   * The Json web key
   * @return key
  **/
  @ApiModelProperty(required = true, value = "The Json web key")
  public JsonWebKey getKey() {
    return key;
  }

  public void setKey(JsonWebKey key) {
    this.key = key;
  }

  public KeyImportParameters attributes(KeyAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

   /**
   * The key management attributes.
   * @return attributes
  **/
  @ApiModelProperty(value = "The key management attributes.")
  public KeyAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(KeyAttributes attributes) {
    this.attributes = attributes;
  }

  public KeyImportParameters tags(Map<String, String> tags) {
    this.tags = tags;
    return this;
  }

  public KeyImportParameters putTagsItem(String key, String tagsItem) {
    if (this.tags == null) {
      this.tags = new HashMap<String, String>();
    }
    this.tags.put(key, tagsItem);
    return this;
  }

   /**
   * Application specific metadata in the form of key-value pairs.
   * @return tags
  **/
  @ApiModelProperty(value = "Application specific metadata in the form of key-value pairs.")
  public Map<String, String> getTags() {
    return tags;
  }

  public void setTags(Map<String, String> tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeyImportParameters keyImportParameters = (KeyImportParameters) o;
    return Objects.equals(this.hsm, keyImportParameters.hsm) &&
        Objects.equals(this.key, keyImportParameters.key) &&
        Objects.equals(this.attributes, keyImportParameters.attributes) &&
        Objects.equals(this.tags, keyImportParameters.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hsm, key, attributes, tags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeyImportParameters {\n");
    
    sb.append("    hsm: ").append(toIndentedString(hsm)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
