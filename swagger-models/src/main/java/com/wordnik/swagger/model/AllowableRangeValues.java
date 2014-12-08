package com.wordnik.swagger.model;

public class AllowableRangeValues implements AllowableValues{

  private final String min;
  private final String max;

  public AllowableRangeValues(String min, String max) {
    this.min = min;
    this.max = max;
  }

  public String min() {
    return min;
  }

  public String max() {
    return max;
  }
}
