package com.jorsek.cld.metadatastorage.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;
import java.util.UUID;

public class WorkerMetadata {

  @JsonProperty("key")
  private String key;

  @JsonProperty("value")
  private String value;

  @JsonProperty("rootResourceUuid")
  private UUID rootResourceUuid;

  private WorkerMetadata() {
  }

  WorkerMetadata(String key, String value, UUID rootResourceUuid) {
    this.key = key;
    this.value = value;
    this.rootResourceUuid = rootResourceUuid;
  }

  public String getKey() {
    return key;
  }

  public String getValue() {
    return value;
  }

  public UUID getRootResourceUuid() {
    return rootResourceUuid;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkerMetadata that = (WorkerMetadata) o;
    return Objects.equals(key, that.key)
        && Objects.equals(value, that.value)
        && Objects.equals(rootResourceUuid, that.rootResourceUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value, rootResourceUuid);
  }

  @Override
  public String toString() {
    return "WorkerMetadata{" + "key='" + key + '\'' + ", value='" + value + '\''
        + ", rootResourceUuid=" + rootResourceUuid + '}';
  }
}

