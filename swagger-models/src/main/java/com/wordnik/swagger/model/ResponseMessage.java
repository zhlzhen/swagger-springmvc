package com.wordnik.swagger.model;

public class ResponseMessage {
  private final int code;
  private final String message;
  private final String responseModel;

  public ResponseMessage(int code, String message, String responseModel) {
    this.code = code;
    this.message = message;
    this.responseModel = responseModel;
  }

  public int code() {
    return code;
  }

  public String message() {
    return message;
  }

  public String responseModel() {
    return responseModel;
  }
}
