package com.wordnik.swagger.model;

public class Parameter {

  private final String name;
  private final String description;
  private final String defaultValue;
  private final Boolean required;
  private final Boolean allowMultiple;
  private final String dataType;
  private final AllowableValues allowableValues;
  private final String paramType;
  private final String paramAccess;

  public Parameter(String name, String description, String defaultValue, Boolean required, Boolean allowMultiple,
                   String dataType, AllowableValues allowableValues, String paramType, String paramAccess) {
    this.name = name;
    this.description = description;
    this.defaultValue = defaultValue;
    this.required = required;
    this.allowMultiple = allowMultiple;
    this.dataType = dataType;
    this.allowableValues = allowableValues;
    this.paramType = paramType;
    this.paramAccess = paramAccess;
  }

  public String name() {
    return name;
  }

  public String description() {
    return description;
  }

  public String defaultValue() {
    return defaultValue;
  }

  public Boolean required() {
    return required;
  }

  public Boolean allowMultiple() {
    return allowMultiple;
  }

  public String dataType() {
    return dataType;
  }

  public AllowableValues allowableValues() {
    return allowableValues;
  }

  public String paramType() {
    return paramType;
  }

  public String paramAccess() {
    return paramAccess;
  }
}
