package com.mangofactory.swagger.models.property;

import com.fasterxml.classmate.ResolvedType;
import com.mangofactory.swagger.models.ModelContext;
import com.wordnik.swagger.model.AllowableValues;

public interface ModelProperty {
  String getName();

  ResolvedType getType();

  String typeName(ModelContext modelContext);

  String qualifiedTypeName();

  AllowableValues allowableValues();

  String propertyDescription();

  boolean isRequired();

  int position();
}
