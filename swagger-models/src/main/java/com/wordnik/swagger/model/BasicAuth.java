package com.wordnik.swagger.model;

public class BasicAuth extends AuthorizationType {
  public BasicAuth() {
    super("basicAuth");
  }

  @Override
  public String getName() {
    return super.aType;
  }
}
