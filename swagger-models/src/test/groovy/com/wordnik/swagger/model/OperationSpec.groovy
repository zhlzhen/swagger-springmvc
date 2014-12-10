package com.wordnik.swagger.model

class OperationSpec extends InternalJsonSerializationSpec {

  def "should serialize an operation"() {
    given:
      Operation operation = new Operation(
              'PUT',
              'updatePet',
              'updatePet',
              'void',
              'updatePet',
              0,
              ["*/*"],
              ['application/json'],
              [],
              [],
              [new Parameter('pet', 'pet', '', false, false, 'Pet', null, 'body', null)],
              [new ResponseMessage(200, null, null)],
              "false")

    expect:
      writePretty(operation) ==
"""{
  "authorizations" : [ ],
  "consumes" : [ "application/json" ],
  "deprecated" : "false",
  "method" : "PUT",
  "nickname" : "updatePet",
  "notes" : "updatePet",
  "parameters" : [ {
    "allowMultiple" : false,
    "allowableValues" : null,
    "dataType" : "Pet",
    "defaultValue" : "",
    "description" : "pet",
    "name" : "pet",
    "paramAccess" : null,
    "paramType" : "body",
    "type" : "Pet",
    "required" : false
  } ],
  "position" : 0,
  "produces" : [ "*/*" ],
  "protocol" : [ ],
  "responseMessages" : [ {
    "code" : 200,
    "message" : null,
    "responseModel" : null
  } ],
  "summary" : "updatePet",
  "type" : "void"
}"""
  }
}
