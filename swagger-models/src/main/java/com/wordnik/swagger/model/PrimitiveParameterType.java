package com.wordnik.swagger.model;

public class PrimitiveParameterType implements ParameterType {
  private final String type;

  public PrimitiveParameterType(String type) {
    this.type = type;
  }

  public String type() {
    return type;
  }
}
