package com.jorsek.cld.publishingbackend.dto;

public enum JobStatusEnum {
  WAITING,
  QUEUED,
  IN_PROGRESS,
  DONE_WITH_ERRORS,
  DONE_WITH_WARNINGS,
  DONE,
  CANCELLING,
  CANCELLED,
  FAILED
}
