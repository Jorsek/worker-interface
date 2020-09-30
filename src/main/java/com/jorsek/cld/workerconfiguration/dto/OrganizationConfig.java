package com.jorsek.cld.workerconfiguration.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;
import java.util.UUID;

public class OrganizationConfig {

  @JsonProperty("org_uuid")
  private UUID orgUuid;

  @JsonProperty("gcs_bucket")
  private String gcsBucket;

  private OrganizationConfig() {
  }

  public OrganizationConfig(UUID orgUuid, String gcsBucket) {
    this();
    this.orgUuid = orgUuid;
    this.gcsBucket = gcsBucket;
  }

  public UUID getOrgId() {
    return orgUuid;
  }

  public String getGcsBucket() {
    return gcsBucket;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationConfig that = (OrganizationConfig) o;
    return Objects.equals(orgUuid, that.orgUuid) &&
        Objects.equals(gcsBucket, that.gcsBucket);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orgUuid, gcsBucket);
  }

  @Override
  public String toString() {
    return "OrganizationConfig{" +
        "orgUuid='" + orgUuid + '\'' +
        ", gcsBucket='" + gcsBucket + '\'' +
        '}';
  }
}
