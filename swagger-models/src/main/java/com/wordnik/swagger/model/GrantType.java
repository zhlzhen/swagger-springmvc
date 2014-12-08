package com.wordnik.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GrantType {
  @JsonProperty("type")
  private final String aType;

  public GrantType(String aType) {
    this.aType = aType;
  }

  public String type() {
    return aType;
  }
}
