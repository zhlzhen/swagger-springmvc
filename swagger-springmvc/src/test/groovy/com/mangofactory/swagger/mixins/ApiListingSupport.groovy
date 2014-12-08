package com.mangofactory.swagger.mixins
import com.wordnik.swagger.model.ApiListing
import com.wordnik.swagger.model.ApiListingReference
import com.wordnik.swagger.model.OAuth
import com.wordnik.swagger.model.ResourceListing


class ApiListingSupport {

   def apiListing(authorizations = [], models = null) {
      new ApiListing(
              "1.0",
              "1.2",
              "",
              "/relative-path-to-endpoint",
              [],
              [],
              [],
              authorizations,
              [],
              models,
              null,
              1);
   }

   def apiListingReference() {
      new ApiListingReference("/path", "description", 3)
   }

   def resourceListing(List<OAuth> authorizationTypes) {
      new ResourceListing(
              "apiVersion",
              "swagger version",
              [apiListingReference()],
              authorizationTypes,
              null)
   }
}
