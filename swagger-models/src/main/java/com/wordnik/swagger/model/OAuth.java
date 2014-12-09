package com.wordnik.swagger.model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

//@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.WRAPPER_OBJECT, property = "@class")
public class OAuth extends AuthorizationType {

  private final List<AuthorizationScope> scopes;
  private final LinkedHashMap<String, GrantType> grantTypes;

  public OAuth(List<AuthorizationScope> scopes, List<GrantType> gTypes) {
    super("oauth2");
    this.scopes = scopes;
    this.grantTypes = initializeGrantTypes(gTypes);

  }

  private LinkedHashMap<String, GrantType> initializeGrantTypes(List<GrantType> gTypes) {
    if (null != gTypes) {
      LinkedHashMap<String, GrantType> map = new LinkedHashMap<String, GrantType>();
      for (GrantType grantType : gTypes) {
        map.put(grantType.type(), grantType);
      }
      return map;
    }
    return null;
  }

  @Override
  public String getName() {
    return super.aType;
  }

  public List<AuthorizationScope> scopes() {
    return scopes;
  }

  public List<GrantType> grantTypes() {
    return new ArrayList<GrantType>(grantTypes.values());
  }
}
