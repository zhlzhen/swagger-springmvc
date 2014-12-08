package com.wordnik.swagger.model;

public class ModelRef {

  private final String aTtype;
  private final String ref;
  private final String qualifiedType;

  public ModelRef(String aTtype, String ref, String qualifiedType) {
    this.aTtype = aTtype;
    this.ref = ref;
    this.qualifiedType = qualifiedType;
  }

  public String type() {
    return aTtype;
  }

  public String ref() {
    return ref;
  }

  public String qualifiedType() {
    return qualifiedType;
  }
}
