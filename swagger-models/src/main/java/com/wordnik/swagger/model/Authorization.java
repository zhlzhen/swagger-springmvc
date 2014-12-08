package com.wordnik.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Authorization {
  @JsonProperty("type")
  private final String aType;
  private final AuthorizationScope[] scopes;

  public Authorization(String aType, AuthorizationScope[] scopes) {
    this.scopes = scopes;
    this.aType = aType;
  }

  public String type() {
    return aType;
  }

  public AuthorizationScope[] scopes() {
    return scopes;
  }
}
