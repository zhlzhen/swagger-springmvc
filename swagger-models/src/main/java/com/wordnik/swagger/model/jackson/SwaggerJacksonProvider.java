package com.wordnik.swagger.model.jackson;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.wordnik.swagger.model.ApiListing;
import com.wordnik.swagger.model.ResourceListing;

public class SwaggerJacksonProvider {

  private final ObjectMapper objectMapper;

  public SwaggerJacksonProvider() {
    this.objectMapper = new ObjectMapper();
    objectMapper.setVisibilityChecker(
            objectMapper.getSerializationConfig().getDefaultVisibilityChecker()
                    .withFieldVisibility(JsonAutoDetect.Visibility.ANY)
                    .withGetterVisibility(JsonAutoDetect.Visibility.NONE)
                    .withSetterVisibility(JsonAutoDetect.Visibility.NONE)
                    .withCreatorVisibility(JsonAutoDetect.Visibility.NONE));
    objectMapper.configure(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY, true);
  }

  public Module swaggerJacksonModule() {
    SimpleModule module = new SimpleModule("SwaggerJacksonModule");
    module.addSerializer(ApiListing.class, new SwaggerApiListingJsonSerializer(objectMapper));
    module.addSerializer(ResourceListing.class, new SwaggerResourceListingJsonSerializer(objectMapper));
    return module;
  }

}
