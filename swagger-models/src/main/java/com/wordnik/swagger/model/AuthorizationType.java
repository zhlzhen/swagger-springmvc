package com.wordnik.swagger.model;

public abstract class AuthorizationType {
  protected final String aType;

  protected AuthorizationType(String aType) {
    this.aType = aType;
  }

  public String type() {
    return aType;
  }

  public abstract String getName();
}
