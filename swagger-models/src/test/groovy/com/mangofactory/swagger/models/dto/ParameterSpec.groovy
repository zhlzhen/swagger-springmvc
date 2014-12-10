package com.mangofactory.swagger.models.dto

import spock.lang.Unroll

class ParameterSpec extends InternalJsonSerializationSpec {

  @Unroll
  def "should serialize dataType[#dataType]"() {
    Parameter parameter = new Parameter("aname", "adesc", "defaultVal", false, false, dataType, null, "path", null)
    when:
      def json = writeAndParse(parameter)
    then:
      assertion.call(json)

    where:
      dataType     | assertion
      "int"        | { it.type == 'integer' && it.format == 'int32' }
      "long"       | { it.type == 'integer' && it.format == 'int64' }
      "float"      | { it.type == 'integer' && it.format == 'int64' }
      "double"     | { it.type == 'number' && it.format == 'double' }
      "Date"       | { it.type == 'string' && it.format == 'date-time' }
      "DateTime"   | { it.type == 'string' && it.format == 'date-time' }
      "string"     | { it.type == 'string' && !it.format }
      "BigDecimal" | { it.type == 'number' && !it.format }
      "BigInteger" | { it.type == 'number' && !it.format }
      "boolean"    | { it.type == 'boolean' && !it.format }
      "byte"       | { it.type == 'string' && it.format == 'byte' }
      "UUID"       | { it.type == 'string' && it.format == 'uuid' }
      "date"       | { it.type == 'string' && it.format == 'date' }
      "date-time"  | { it.type == 'string' && it.format == 'date-time' }
  }
}
