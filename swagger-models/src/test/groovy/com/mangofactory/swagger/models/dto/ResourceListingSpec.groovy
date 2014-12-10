package com.mangofactory.swagger.models.dto

import static com.google.common.collect.Lists.newArrayList

class ResourceListingSpec extends InternalJsonSerializationSpec {

  def "should serialize"() {
    when:
      def json = writeAndParse(resourceListing())
    then:
      json
  }


  def apiListingReference() {
    new ApiListingReference("/path", "description", 3)
  }


  def resourceListing() {
    List<AuthorizationScope> authorizationScopeList = newArrayList();
    authorizationScopeList.add(new AuthorizationScope("global", "access all"));

    List<GrantType> grantTypes = newArrayList();

    LoginEndpoint loginEndpoint = new LoginEndpoint("http://petstore.swagger.wordnik.com/oauth/dialog");
    grantTypes.add(new ImplicitGrant(loginEndpoint, "access_token"));

    TokenRequestEndpoint tokenRequestEndpoint = new TokenRequestEndpoint("http://petstore.swagger.wordnik.com/oauth/requestToken", "client_id", "client_secret");
    TokenEndpoint tokenEndpoint = new TokenEndpoint("http://petstore.swagger.wordnik.com/oauth/token", "auth_code");

    AuthorizationCodeGrant authorizationCodeGrant = new AuthorizationCodeGrant(tokenRequestEndpoint, tokenEndpoint);
    grantTypes.add(authorizationCodeGrant);


    OAuth oAuth = new OAuthBuilder()
            .scopes(authorizationScopeList)
            .grantTypes(grantTypes)
            .build();

    ApiInfo apiInfo = apiInfo()

    new ResourceListing(
            "apiVersion",
            "swagger version",
            [apiListingReference()],
            [oAuth],
            apiInfo)
  }

  private ApiInfo apiInfo() {
    ApiInfo apiInfo = new ApiInfo(
            " Title",
            "Api Description",
            "Api terms of service",
            "Contact Email",
            "Licence Type",
            "License URL"
    )
    apiInfo
  }
}
