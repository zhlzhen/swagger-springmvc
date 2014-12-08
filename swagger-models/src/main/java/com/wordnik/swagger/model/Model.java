package com.wordnik.swagger.model;

import java.util.List;
import java.util.Map;

public class Model {

  private final String id;
  private final String name;
  private final String qualifiedType;
  private final Map<String, ModelProperty> properties;
  private final String description;
  private final String baseModel;
  private final String discriminator;
  private final List<String> subTypes;

  public Model(String id, String name, String qualifiedType, Map<String, ModelProperty> properties, String
          description, String baseModel, String discriminator, List<String> subTypes) {
    this.id = id;
    this.name = name;
    this.qualifiedType = qualifiedType;
    this.properties = properties;
    this.description = description;
    this.baseModel = baseModel;
    this.discriminator = discriminator;
    this.subTypes = subTypes;
  }

  public String id() {
    return id;
  }

  public String name() {
    return name;
  }

  public String qualifiedType() {
    return qualifiedType;
  }

  public Map<String, ModelProperty> properties() {
    return properties;
  }

  public String description() {
    return description;
  }

  public String baseModel() {
    return baseModel;
  }

  public String discriminator() {
    return discriminator;
  }

  public List<String> subTypes() {
    return subTypes;
  }
}
