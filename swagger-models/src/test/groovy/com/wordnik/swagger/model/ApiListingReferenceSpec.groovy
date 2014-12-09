package com.wordnik.swagger.model

class ApiListingReferenceSpec extends InternalJsonSerializationSpec {

  def "should serialize"() {
    setup:
      def path = 'path'
      def desc = 'desc'
      def pos = 2

    when:
      def json = writeAndParse(new ApiListingReference(path, desc, pos))
    then:
      json['path'] == path
      json['description'] == desc
      json['position'] == pos
  }
}
