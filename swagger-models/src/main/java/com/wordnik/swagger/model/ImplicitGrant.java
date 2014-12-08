package com.wordnik.swagger.model;

public class ImplicitGrant extends GrantType {
  private final String loginEndpoint;
  private final String tokenName;

  public ImplicitGrant(String loginEndpoint, String tokenName) {
    super("implicit");
    this.loginEndpoint = loginEndpoint;
    this.tokenName = tokenName;
  }

  public String loginEndpoint() {
    return loginEndpoint;
  }

  public String tokenName() {
    return tokenName;
  }
}
