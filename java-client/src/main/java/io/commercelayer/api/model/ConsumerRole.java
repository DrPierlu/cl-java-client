/**
 * Commerce Layer
 * The Commerce API You Wish You Had
 *
 * OpenAPI spec version: 0.0.1
 * Contact: filippo@commercelayer.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.commercelayer.api.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;


/**
 * ConsumerRole
 */
public class ConsumerRole extends ApiObject {

  @SerializedName("environment_id")
  private String environmentId = null;

  @SerializedName("consumer_id")
  private String consumerId = null;

  @SerializedName("consumer_resource")
  private String consumerResource = null;

  @SerializedName("role_id")
  private String roleId = null;

  @SerializedName("position")
  private String position = null;

  @SerializedName("creator_id")
  private String creatorId = null;

  @SerializedName("creator_resource")
  private String creatorResource = null;


  public ConsumerRole environmentId(String environmentId) {
    this.environmentId = environmentId;
    return this;
  }

  
  public String getEnvironmentId() {
    return environmentId;
  }

  public void setEnvironmentId(String environmentId) {
    this.environmentId = environmentId;
  }

  public ConsumerRole consumerId(String consumerId) {
    this.consumerId = consumerId;
    return this;
  }

   
  public String getConsumerId() {
    return consumerId;
  }

  public void setConsumerId(String consumerId) {
    this.consumerId = consumerId;
  }

  public ConsumerRole consumerResource(String consumerResource) {
    this.consumerResource = consumerResource;
    return this;
  }

   
  public String getConsumerResource() {
    return consumerResource;
  }

  public void setConsumerResource(String consumerResource) {
    this.consumerResource = consumerResource;
  }

  public ConsumerRole roleId(String roleId) {
    this.roleId = roleId;
    return this;
  }

   
  public String getRoleId() {
    return roleId;
  }

  public void setRoleId(String roleId) {
    this.roleId = roleId;
  }

  public ConsumerRole position(String position) {
    this.position = position;
    return this;
  }

   
  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public ConsumerRole creatorId(String creatorId) {
    this.creatorId = creatorId;
    return this;
  }

  
  public String getCreatorId() {
    return creatorId;
  }

  public void setCreatorId(String creatorId) {
    this.creatorId = creatorId;
  }

  public ConsumerRole creatorResource(String creatorResource) {
    this.creatorResource = creatorResource;
    return this;
  }

  
  public String getCreatorResource() {
    return creatorResource;
  }

  public void setCreatorResource(String creatorResource) {
    this.creatorResource = creatorResource;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsumerRole consumerRole = (ConsumerRole) o;
    return Objects.equals(this.resourceName, consumerRole.resourceName) &&
        Objects.equals(this.id, consumerRole.id) &&
        Objects.equals(this.environmentId, consumerRole.environmentId) &&
        Objects.equals(this.consumerId, consumerRole.consumerId) &&
        Objects.equals(this.consumerResource, consumerRole.consumerResource) &&
        Objects.equals(this.roleId, consumerRole.roleId) &&
        Objects.equals(this.position, consumerRole.position) &&
        Objects.equals(this.creatorId, consumerRole.creatorId) &&
        Objects.equals(this.creatorResource, consumerRole.creatorResource) &&
        Objects.equals(this.createdAt, consumerRole.createdAt) &&
        Objects.equals(this.updatedAt, consumerRole.updatedAt) &&
        Objects.equals(this.expanded, consumerRole.expanded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceName, id, environmentId, consumerId, consumerResource, roleId, position, creatorId, creatorResource, createdAt, updatedAt, expanded);
  }

}

