package com.jorsek.cld.metadatastorage.dto;

import java.util.UUID;

public class WorkerMetadataBuilder {

  private String key;
  private String value;
  private UUID rootResourceUuid;

  public WorkerMetadataBuilder withKey(String key) {
    this.key = key;
    return this;
  }

  public WorkerMetadataBuilder withValue(String value) {
    this.value = value;
    return this;
  }

  public WorkerMetadataBuilder withRootResourceUuid(UUID rootResourceUuid) {
    this.rootResourceUuid = rootResourceUuid;
    return this;
  }

  public WorkerMetadata build() {
    return new WorkerMetadata(key, value, rootResourceUuid);
  }

  public static WorkerMetadataBuilder aWorkerMetadata() {
    return new WorkerMetadataBuilder();
  }
}
