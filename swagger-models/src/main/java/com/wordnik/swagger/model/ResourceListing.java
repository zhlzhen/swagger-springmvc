package com.wordnik.swagger.model;

import java.util.List;

public class ResourceListing {
  private final String apiVersion;
  private final String swaggerVersion;
  private final List<ApiListingReference> apis;
  private final List<AuthorizationType> authorizations;
  private final ApiInfo info;

  public ResourceListing(String apiVersion, String swaggerVersion, List<ApiListingReference> apis, List
          <AuthorizationType> authorizations, ApiInfo info) {
    this.apiVersion = apiVersion;
    this.swaggerVersion = swaggerVersion;
    this.apis = apis;
    this.authorizations = authorizations;
    this.info = info;
  }

  public String apiVersion() {
    return apiVersion;
  }

  public String swaggerVersion() {
    return swaggerVersion;
  }

  public List<ApiListingReference> apis() {
    return apis;
  }

  public List<AuthorizationType> authorizations() {
    return authorizations;
  }

  public ApiInfo info() {
    return info;
  }
}
