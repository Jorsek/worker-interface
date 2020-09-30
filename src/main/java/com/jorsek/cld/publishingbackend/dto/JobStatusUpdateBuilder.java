package com.jorsek.cld.publishingbackend.dto;

import java.util.List;
import java.util.UUID;

public final class JobStatusUpdateBuilder {

  List<LogMessage> logMessages;
  List<String> resourceLinks;
  private UUID jobId;
  private JobStatusEnum status;
  private int progress;

  private JobStatusUpdateBuilder() {
  }

  public static JobStatusUpdateBuilder aJobStatusUpdate() {
    return new JobStatusUpdateBuilder();
  }

  public JobStatusUpdateBuilder withJobId(UUID jobId) {
    this.jobId = jobId;
    return this;
  }

  public JobStatusUpdateBuilder withStatus(JobStatusEnum status) {
    this.status = status;
    return this;
  }

  public JobStatusUpdateBuilder withProgress(int progress) {
    this.progress = progress;
    return this;
  }

  public JobStatusUpdateBuilder withLogMessages(List<LogMessage> logMessages) {
    this.logMessages = logMessages;
    return this;
  }

  public JobStatusUpdateBuilder withResourceLinks(List<String> resourceLinks) {
    this.resourceLinks = resourceLinks;
    return this;
  }

  public JobStatusUpdate build() {
    return new JobStatusUpdate(jobId, status, progress, logMessages, resourceLinks);
  }
}
