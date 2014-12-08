package com.wordnik.swagger.model;

import java.util.List;

public class OAuth extends AuthorizationType {

  private final List<AuthorizationScope> scopes;
  private final List<AuthorizationScope> grantTypes;

  public OAuth(List<AuthorizationScope> scopes, List<AuthorizationScope> grantTypes) {
    super("oauth2");
    this.scopes = scopes;
    this.grantTypes = grantTypes;
  }

  @Override
  public String getName() {
    return super.aType;
  }

  public List<AuthorizationScope> scopes() {
    return scopes;
  }

  public List<AuthorizationScope> grantTypes() {
    return grantTypes;
  }
}
