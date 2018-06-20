/*
 * stash-server
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v0
 * Contact: hello@appscode.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.appscode.searchlight.client.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * V1alpha1AcknowledgementRequest
 */

public class V1alpha1AcknowledgementRequest {
  @SerializedName("comment")
  private String comment = null;

  @SerializedName("skipNotify")
  private Boolean skipNotify = null;

  public V1alpha1AcknowledgementRequest comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * Comment by user
   * @return comment
  **/
  @ApiModelProperty(required = true, value = "Comment by user")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public V1alpha1AcknowledgementRequest skipNotify(Boolean skipNotify) {
    this.skipNotify = skipNotify;
    return this;
  }

   /**
   * Skip sending notification
   * @return skipNotify
  **/
  @ApiModelProperty(value = "Skip sending notification")
  public Boolean isSkipNotify() {
    return skipNotify;
  }

  public void setSkipNotify(Boolean skipNotify) {
    this.skipNotify = skipNotify;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1AcknowledgementRequest v1alpha1AcknowledgementRequest = (V1alpha1AcknowledgementRequest) o;
    return Objects.equals(this.comment, v1alpha1AcknowledgementRequest.comment) &&
        Objects.equals(this.skipNotify, v1alpha1AcknowledgementRequest.skipNotify);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, skipNotify);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1AcknowledgementRequest {\n");
    
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    skipNotify: ").append(toIndentedString(skipNotify)).append("\n");
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
