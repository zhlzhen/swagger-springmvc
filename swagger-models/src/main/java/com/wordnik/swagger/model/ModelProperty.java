package com.wordnik.swagger.model;

public class ModelProperty {
  private final String aType;
  private final String qualifiedType;
  private final int position;
  private final Boolean required;
  private final String description;
  private final AllowableValues allowableValues;
  private final ModelRef items;

  public ModelProperty(String aType, String qualifiedType, int position, Boolean required, String description,
                       AllowableValues allowableValues, ModelRef items) {
    this.aType = aType;
    this.qualifiedType = qualifiedType;
    this.position = position;
    this.required = required;
    this.description = description;
    this.allowableValues = allowableValues;
    this.items = items;
  }

  public String type() {
    return aType;
  }

  public String qualifiedType() {
    return qualifiedType;
  }

  public int position() {
    return position;
  }

  public Boolean required() {
    return required;
  }

  public String description() {
    return description;
  }

  public AllowableValues allowableValues() {
    return allowableValues;
  }

  public ModelRef items() {
    return items;
  }
}
