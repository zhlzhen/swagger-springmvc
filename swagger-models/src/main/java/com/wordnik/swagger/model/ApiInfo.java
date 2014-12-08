package com.wordnik.swagger.model;

public class ApiInfo {

  private final String title;
  private final String description;
  private final String termsOfServiceUrl;
  private final String contact;
  private final String license;
  private final String licenseUrl;

  public ApiInfo(String title, String description, String termsOfServiceUrl, String contact, String license, String
          licenseUrl) {
    this.title = title;
    this.description = description;
    this.termsOfServiceUrl = termsOfServiceUrl;
    this.contact = contact;
    this.license = license;
    this.licenseUrl = licenseUrl;
  }

  public String title() {
    return title;
  }

  public String description() {
    return description;
  }

  public String termsOfServiceUrl() {
    return termsOfServiceUrl;
  }

  public String contact() {
    return contact;
  }

  public String license() {
    return license;
  }

  public String licenseUrl() {
    return licenseUrl;
  }
}
