// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class AccountsCreateMetastoreAssignment {
  /** */
  @JsonProperty("metastore_assignment")
  private CreateMetastoreAssignment metastoreAssignment;

  /** Unity Catalog metastore ID */
  @JsonIgnore private String metastoreId;

  /** Workspace ID. */
  @JsonIgnore private Long workspaceId;

  public AccountsCreateMetastoreAssignment setMetastoreAssignment(
      CreateMetastoreAssignment metastoreAssignment) {
    this.metastoreAssignment = metastoreAssignment;
    return this;
  }

  public CreateMetastoreAssignment getMetastoreAssignment() {
    return metastoreAssignment;
  }

  public AccountsCreateMetastoreAssignment setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  public String getMetastoreId() {
    return metastoreId;
  }

  public AccountsCreateMetastoreAssignment setWorkspaceId(Long workspaceId) {
    this.workspaceId = workspaceId;
    return this;
  }

  public Long getWorkspaceId() {
    return workspaceId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AccountsCreateMetastoreAssignment that = (AccountsCreateMetastoreAssignment) o;
    return Objects.equals(metastoreAssignment, that.metastoreAssignment)
        && Objects.equals(metastoreId, that.metastoreId)
        && Objects.equals(workspaceId, that.workspaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metastoreAssignment, metastoreId, workspaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(AccountsCreateMetastoreAssignment.class)
        .add("metastoreAssignment", metastoreAssignment)
        .add("metastoreId", metastoreId)
        .add("workspaceId", workspaceId)
        .toString();
  }
}
