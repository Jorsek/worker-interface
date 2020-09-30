package com.jorsek.cld.publishingbackend.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum LogMessageLevel {
  @JsonProperty("error")
  ERROR,
  @JsonProperty("warning")
  WARNING,
  @JsonProperty("info")
  INFO,
  @JsonProperty("debug")
  DEBUG
}
