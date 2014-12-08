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

  public String getApiVersion() {
    return apiVersion;
  }

  public String getSwaggerVersion() {
    return swaggerVersion;
  }

  public List<ApiListingReference> getApis() {
    return apis;
  }

  public List<AuthorizationType> getAuthorizations() {
    return authorizations;
  }

  public ApiInfo getInfo() {
    return info;
  }
}
