package com.jorsek.cld.workerconfiguration.dto;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Configuration {

  private Map<String, String> configuration = new HashMap<>();
  private OrganizationConfig organization;

  public Configuration() {
  }

  public Configuration(Map<String, String> configuration, OrganizationConfig organization) {
    this.configuration = configuration;
    this.organization = organization;
  }

  public Map<String, String> getConfiguration() {
    return configuration;
  }

  public OrganizationConfig getOrganization() {
    return organization;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Configuration that = (Configuration) o;
    return Objects.equals(configuration, that.configuration) &&
        Objects.equals(organization, that.organization);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configuration, organization);
  }

  @Override
  public String toString() {
    return "Configuration{" +
        "configuration=" + configuration +
        ", organization=" + organization +
        '}';
  }
}
