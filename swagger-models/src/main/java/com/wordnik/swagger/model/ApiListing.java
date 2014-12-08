package com.wordnik.swagger.model;

import java.util.List;
import java.util.Map;

public class ApiListing {
  private final String apiVersion;
  private final String swaggerVersion;
  private final String basePath;
  private final String resourcePath;
  private final List<String> produces;
  private final List<String> consumes;
  private final List<String> protocol;
  private final List<Authorization> authorizations;
  private final List<ApiDescription> apis;
  private final Map<String, Model> models;
  private final String description;
  private final int position;

  public ApiListing(String apiVersion, String swaggerVersion, String basePath, String resourcePath, List<String>
          produces, List<String> consumes, List<String> protocol, List<Authorization> authorizations,
                    List<ApiDescription> apis, Map<String, Model> models, String description, int position) {
    this.apiVersion = apiVersion;
    this.swaggerVersion = swaggerVersion;
    this.basePath = basePath;
    this.resourcePath = resourcePath;
    this.produces = produces;
    this.consumes = consumes;
    this.protocol = protocol;
    this.authorizations = authorizations;
    this.apis = apis;
    this.models = models;
    this.description = description;
    this.position = position;
  }

  public String apiVersion() {
    return apiVersion;
  }

  public String swaggerVersion() {
    return swaggerVersion;
  }

  public String basePath() {
    return basePath;
  }

  public String resourcePath() {
    return resourcePath;
  }

  public List<String> produces() {
    return produces;
  }

  public List<String> consumes() {
    return consumes;
  }

  public List<String> protocol() {
    return protocol;
  }

  public List<Authorization> authorizations() {
    return authorizations;
  }

  public List<ApiDescription> apis() {
    return apis;
  }

  public Map<String, Model> models() {
    return models;
  }

  public String description() {
    return description;
  }

  public int position() {
    return position;
  }
}

