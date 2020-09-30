package com.jorsek.cld.publishingbackend.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class JobStatusUpdate {

  @JsonProperty("job_id")
  private UUID jobId;

  @JsonProperty("status")
  private JobStatusEnum status;

  @JsonProperty("progress")
  private int progress;

  @JsonProperty("log_messages")
  List<LogMessage> logMessages;

  @JsonProperty("resource_links")
  List<String> resourceLinks;

  private JobStatusUpdate() {
  }

  public JobStatusUpdate(UUID jobId, JobStatusEnum status, int progress,
      List<LogMessage> logMessages, List<String> resourceLinks) {
    this.jobId = jobId;
    this.status = status;
    this.progress = progress;
    this.logMessages = logMessages;
    this.resourceLinks = resourceLinks;
  }

  public UUID getJobId() {
    return jobId;
  }

  public JobStatusEnum getStatus() {
    return status;
  }

  public int getProgress() {
    return progress;
  }

  public List<LogMessage> getLogMessages() {
    return logMessages == null ? null : new ArrayList<>(logMessages);
  }

  public List<String> getResourceLinks() {
    return resourceLinks == null ? null : new ArrayList<>(resourceLinks);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobStatusUpdate that = (JobStatusUpdate) o;
    return progress == that.progress &&
        Objects.equals(jobId, that.jobId) &&
        status == that.status &&
        Objects.equals(logMessages, that.logMessages) &&
        Objects.equals(resourceLinks, that.resourceLinks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobId, status, progress, logMessages, resourceLinks);
  }
}
