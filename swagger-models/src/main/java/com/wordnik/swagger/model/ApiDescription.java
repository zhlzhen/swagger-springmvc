package com.wordnik.swagger.model;

import java.util.List;

public class ApiDescription {
  private final String path;
  private final String description;
  private final List<Operation> operations;
  private final Boolean hidden;

  public ApiDescription(String path, String description, List<Operation> operations, Boolean hidden) {
    this.path = path;
    this.description = description;
    this.operations = operations;
    this.hidden = hidden;
  }

  public String path() {
    return path;
  }

  public String description() {
    return description;
  }

  public List<Operation> operations() {
    return operations;
  }

  public Boolean hidden() {
    return hidden;
  }
}
