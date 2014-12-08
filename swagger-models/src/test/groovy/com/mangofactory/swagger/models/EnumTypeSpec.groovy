package com.mangofactory.swagger.models

import com.mangofactory.swagger.mixins.ModelProviderSupport
import com.mangofactory.swagger.mixins.TypesForTestingSupport
import com.wordnik.swagger.model.Model
import spock.lang.Specification

import static com.google.common.collect.Lists.*
import static com.mangofactory.swagger.models.ModelContext.*

@Mixin([TypesForTestingSupport, ModelProviderSupport])
class EnumTypeSpec extends Specification {
  def "enum type are inferred as type string with allowable values" () {
    given:
      def list = newArrayList("ONE", "TWO")
      def provider = defaultModelProvider()
      Model asInput = provider.modelFor(inputParam(enumType())).get()
      Model asReturn = provider.modelFor(returnValue(enumType())).get()

    expect:
      asInput.name() == "ExampleWithEnums"
      asInput.properties().containsKey("exampleEnum")
      def modelPropertyOption = asInput.properties().get("exampleEnum")
      def modelProperty = modelPropertyOption
      modelProperty.type() == "string"
      modelProperty.qualifiedType() == "com.mangofactory.swagger.models.ExampleEnum"
      modelProperty.items() == null
      Types.isBaseType(modelProperty.type())
      modelProperty.allowableValues().values() == list

      asReturn.name() == "ExampleWithEnums"
      asReturn.properties().containsKey("exampleEnum")
      def retModelPropertyOption = asReturn.properties().get("exampleEnum")
      def retModelProperty = retModelPropertyOption
      retModelProperty.type() == "string"
      retModelProperty.qualifiedType() == "com.mangofactory.swagger.models.ExampleEnum"
      retModelProperty.items() == null
      Types.isBaseType(modelProperty.type())
      retModelProperty.allowableValues().values() == list
  }
}
