// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Get permissions */
@Generated
public class GetGrantRequest {
  /** Full name of securable. */
  @JsonIgnore private String fullName;

  /** If provided, only the permissions for the specified principal (user or group) are returned. */
  @JsonIgnore
  @QueryParam("principal")
  private String principal;

  /** Type of securable. */
  @JsonIgnore private SecurableType securableType;

  public GetGrantRequest setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  public GetGrantRequest setPrincipal(String principal) {
    this.principal = principal;
    return this;
  }

  public String getPrincipal() {
    return principal;
  }

  public GetGrantRequest setSecurableType(SecurableType securableType) {
    this.securableType = securableType;
    return this;
  }

  public SecurableType getSecurableType() {
    return securableType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetGrantRequest that = (GetGrantRequest) o;
    return Objects.equals(fullName, that.fullName)
        && Objects.equals(principal, that.principal)
        && Objects.equals(securableType, that.securableType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullName, principal, securableType);
  }

  @Override
  public String toString() {
    return new ToStringer(GetGrantRequest.class)
        .add("fullName", fullName)
        .add("principal", principal)
        .add("securableType", securableType)
        .toString();
  }
}
