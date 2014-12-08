package com.wordnik.swagger.model;

public class AuthorizationCodeGrant extends GrantType {

  private final String tokenRequestEndpoint;
  private final String tokenEndpoint;

  public AuthorizationCodeGrant(String tokenRequestEndpoint, String tokenEndpoint) {
    super("authorization_code");
    this.tokenRequestEndpoint = tokenRequestEndpoint;
    this.tokenEndpoint = tokenEndpoint;
  }

  public String tokenRequestEndpoint() {
    return tokenRequestEndpoint;
  }

  public String tokenEndpoint() {
    return tokenEndpoint;
  }
}
