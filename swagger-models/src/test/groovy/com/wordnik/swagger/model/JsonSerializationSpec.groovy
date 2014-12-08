package com.wordnik.swagger.model

import com.fasterxml.jackson.databind.ObjectMapper
import groovy.json.JsonSlurper
import spock.lang.Specification

class JsonSerializationSpec extends Specification {

  ObjectMapper objectMapper = new InternalObjectMapperProvider().objectMapper()

  def writeAndParse(object, boolean print = true) {
    def jsonString = objectMapper.writeValueAsString(object)
    def json = new JsonSlurper().parseText(jsonString)
    if (print) {
      println jsonString
    }
    json
  }
}