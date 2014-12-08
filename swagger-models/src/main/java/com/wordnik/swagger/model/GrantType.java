package com.wordnik.swagger.model;

public class GrantType {

  private final String aType;

  public GrantType(String aType) {
    this.aType = aType;
  }

  public String type() {
    return aType;
  }
}
