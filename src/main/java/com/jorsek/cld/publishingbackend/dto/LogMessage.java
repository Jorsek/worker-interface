package com.jorsek.cld.publishingbackend.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LogMessage {

  @JsonProperty("level")
  private LogMessageLevel level;

  @JsonProperty("message")
  private String message;

  @JsonProperty("timestamp")
  private long timestamp;

  private LogMessage() {
  }

  public LogMessage(LogMessageLevel level, String message, long timestamp) {
    this.level = level;
    this.message = message;
    this.timestamp = timestamp;
  }

  public LogMessageLevel getLevel() {
    return level;
  }

  public String getMessage() {
    return message;
  }

  public long getTimestamp() {
    return timestamp;
  }

}
