package com.jorsek.cld.publishingbackend.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;
import java.util.UUID;

public class NewJob {

  @JsonProperty("job_id")
  private UUID jobId;

  @JsonProperty("token")
  private String token;

  @JsonProperty("user")
  private String user;

  @JsonProperty("resource_locator")
  private String resourceLocator;

  @JsonProperty("parameters")
  private Object parameters;

  private NewJob() {
  }

  public NewJob(UUID jobId, String token, String user, String resourceLocator,
      Object parameters) {
    this.jobId = jobId;
    this.token = token;
    this.user = user;
    this.resourceLocator = resourceLocator;
    this.parameters = parameters;
  }

  public UUID getJobId() {
    return jobId;
  }

  public String getToken() {
    return token;
  }

  public String getUser() {
    return user;
  }

  public String getResourceLocator() {
    return resourceLocator;
  }

  public Object getParameters() {
    return parameters;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewJob newJob = (NewJob) o;
    return Objects.equals(jobId, newJob.jobId) &&
        Objects.equals(token, newJob.token) &&
        Objects.equals(user, newJob.user) &&
        Objects.equals(resourceLocator, newJob.resourceLocator) &&
        Objects.equals(parameters, newJob.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobId, token, user, resourceLocator, parameters);
  }
}

