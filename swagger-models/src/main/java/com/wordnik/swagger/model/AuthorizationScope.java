package com.wordnik.swagger.model;

public class AuthorizationScope {
  private final String scope;
  private final String description;

  public AuthorizationScope(String scope, String description) {
    this.description = description;
    this.scope = scope;
  }

  public String scope() {
    return scope;
  }

  public String description() {
    return description;
  }
}
