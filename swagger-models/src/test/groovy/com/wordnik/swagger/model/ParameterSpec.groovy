package com.wordnik.swagger.model

class ParameterSpec extends InternalJsonSerializationSpec {

  def "should serialize"() {

    Parameter parameter = new Parameter("aname", "adesc", "defaultVal", false, false, "Date", null, "path", null)
    when:
      def json = writeAndParse(parameter)
    then:
      json
  }
}
