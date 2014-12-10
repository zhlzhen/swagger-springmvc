package com.mangofactory.swagger.models.dto

import spock.lang.Specification

class AnyAllowableValuesSpec extends Specification {

  def "should pass coverage"() {
    expect:
      new AnyAllowableValues()
  }
}
