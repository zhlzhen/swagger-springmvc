package com.wordnik.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class AuthorizationType {
  @JsonProperty("type")
  protected final String aType;

  protected AuthorizationType(String aType) {
    this.aType = aType;
  }

  public String type() {
    return aType;
  }

  public abstract String getName();
}
