package com.wordnik.swagger.model;

public class Authorization {
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
