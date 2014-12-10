package com.mangofactory.swagger.models.dto.jackson

import com.fasterxml.jackson.annotation.JsonAutoDetect
import com.fasterxml.jackson.databind.Module
import com.fasterxml.jackson.databind.introspect.VisibilityChecker
import spock.lang.Specification

class SwaggerJacksonProviderSpec extends Specification {

  def "should initialize object mapper with mapping features "() {
    SwaggerJacksonProvider swaggerJacksonProvider = new SwaggerJacksonProvider()
    VisibilityChecker checker = swaggerJacksonProvider.objectMapper.getVisibilityChecker()
    expect:
      checker._getterMinLevel == JsonAutoDetect.Visibility.NONE
      checker._setterMinLevel == JsonAutoDetect.Visibility.NONE
      checker._creatorMinLevel == JsonAutoDetect.Visibility.NONE
      checker._fieldMinLevel == JsonAutoDetect.Visibility.ANY
  }

  def "should create serialization module"() {
    SwaggerJacksonProvider swaggerJacksonProvider = new SwaggerJacksonProvider()
    Module module = swaggerJacksonProvider.swaggerJacksonModule()
    expect:
      module._serializers._classMappings.size() == 2

  }
}
