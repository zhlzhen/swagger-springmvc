package com.wordnik.swagger.model;


public class ImplicitGrant extends GrantType {
  private final LoginEndpoint loginEndpoint;
  private final String tokenName;

  public ImplicitGrant(LoginEndpoint loginEndpoint, String tokenName) {
    super("implicit");
    this.loginEndpoint = loginEndpoint;
    this.tokenName = tokenName;
  }

  public LoginEndpoint loginEndpoint() {
    return loginEndpoint;
  }

  public String tokenName() {
    return tokenName;
  }
}
