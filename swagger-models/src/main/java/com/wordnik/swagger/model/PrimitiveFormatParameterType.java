package com.wordnik.swagger.model;


public class PrimitiveFormatParameterType implements ParameterType {
  private final String type;
  private final String format;

  public PrimitiveFormatParameterType(String type, String format) {
    this.type = type;
    this.format = format;
  }

  public String type() {
    return type;
  }

  public String format() {
    return format;
  }
}
