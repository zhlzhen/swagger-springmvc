package com.wordnik.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Authorization {
  private final String type;
  private final AuthorizationScope[] scopes;

  public Authorization(String type, AuthorizationScope[] scopes) {
    this.scopes = scopes;
    this.type = type;
  }

  public String getType() {
    return type;
  }

  public AuthorizationScope[] getScopes() {
    return scopes;
  }
}
