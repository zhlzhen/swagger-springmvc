package com.wordnik.swagger.model;

public class ApiListingReference {
  private final String path;
  private final String description;
  private final int position;

  public ApiListingReference(String path, String description, int position) {
    this.path = path;
    this.description = description;
    this.position = position;
  }

  public String path() {
    return path;
  }

  public String description() {
    return description;
  }

  public int position() {
    return position;
  }
}
