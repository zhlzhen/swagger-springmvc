package com.mangofactory.swagger.models

import com.wordnik.swagger.model.AllowableListValues
import spock.lang.Specification

import static com.google.common.collect.Lists.newArrayList

class EnumsSpec extends Specification {
  def "enums support @JsonValue annotation"() {
    given:
      def expected = new AllowableListValues(newArrayList("One", "Two"), "LIST")
    expect:
      expected.values() == Enums.allowableValues(JsonValuedEnum).values()

  }

  def "enums support regular enums"() {
    given:
      def expected = new AllowableListValues(newArrayList("ONE", "TWO"), "LIST")
    expect:
      expected.values() == Enums.allowableValues(ExampleEnum).values()
  }

  def "enums work with incorrectly annotated enums"() {
    given:
      def expected = new AllowableListValues(newArrayList("ONE", "TWO"), "LIST")
    expect:
      expected.values() == Enums.allowableValues(IncorrectlyJsonValuedEnum).values()
  }

  def "Enums class in not instantiable"() {
    when:
      new Enums()
    then:
      thrown(UnsupportedOperationException)
  }
}
