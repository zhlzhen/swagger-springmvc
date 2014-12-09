package com.wordnik.swagger.model;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class ResourceListing {
  private final String apiVersion;
  private final String swaggerVersion;
  private final List<ApiListingReference> apis;
  private final LinkedHashMap<String, AuthorizationType> authorizations;
  private final ApiInfo info;

  public ResourceListing(String apiVersion, String swaggerVersion, List<ApiListingReference> apis, List
          <AuthorizationType> authorizations, ApiInfo info) {
    this.apiVersion = apiVersion;
    this.swaggerVersion = swaggerVersion;
    this.apis = apis;
    this.authorizations = initializeAuthTypes(authorizations);
    this.info = info;
  }

  private LinkedHashMap<String, AuthorizationType> initializeAuthTypes(List<AuthorizationType> authorizationTypes) {
    if (null != authorizationTypes) {
      LinkedHashMap<String, AuthorizationType> map = new LinkedHashMap<String, AuthorizationType>();
      for (AuthorizationType authorizationType : authorizationTypes) {
        map.put(authorizationType.type(), authorizationType);
      }
      return map;
    }
    return null;
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
    return new ArrayList<AuthorizationType>(authorizations.values());
  }

  public ApiInfo info() {
    return info;
  }
}
