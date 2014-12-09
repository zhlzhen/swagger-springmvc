package com.wordnik.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;

public class Parameter {

  @JsonProperty
  @JsonUnwrapped
  private final ParameterType parameterType;
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
    this.parameterType = typeFromDataType();
  }

  private ParameterType typeFromDataType() {
    if (isType("int")) {
      return new PrimitiveFormatParameterType("integer", "int32");
    }
    if (isType("long")) {
      return new PrimitiveFormatParameterType("integer", "int64");
    }
    if (isType("float")) {
      return new PrimitiveFormatParameterType("integer", "int64");
    }
    if (isType("double")) {
      return new PrimitiveFormatParameterType("number", "double");
    }
    if (isType("string")) {
      return new PrimitiveParameterType("string");
    }
    if (isType("byte")) {
      return new PrimitiveFormatParameterType("string", "byte");
    }
    if (isType("boolean")) {
      return new PrimitiveParameterType("boolean");
    }
    if (isType("Date") || isType("DateTime")) {
      return new PrimitiveFormatParameterType("string", "date-time");
    }
    if (isType("BigDecimal") || isType("BigInteger")) {
      return new PrimitiveParameterType("number");
    }
    if (isType("UUID")) {
      return new PrimitiveFormatParameterType("string", "uuid");
    }
    if (isType("date")) {
      return new PrimitiveFormatParameterType("string", "date");
    }
    if (isType("date-time")) {
      return new PrimitiveFormatParameterType("string", "date-time");
    }
    return new PrimitiveParameterType(dataType);
  }

  private boolean isType(String ofType) {
    return dataType.equals(ofType);
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

  public ParameterType parameterType() {
    return parameterType;
  }
}
