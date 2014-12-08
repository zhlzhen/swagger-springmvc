package com.wordnik.swagger.model;

import java.util.List;

public class Operation {

  private final String method;
  private final String summary;
  private final String notes;
  private final String responseClass;
  private final String nickname;
  private final int position;
  private final List<String> produces;
  private final List<String> consumes;
  private final List<String> protocol;
  private final List<Authorization> authorizations;
  private final List<Parameter> parameters;
  private final List<ResponseMessage> responseMessages;
  private final String deprecated;

  public Operation(String method, String summary, String notes, String responseClass, String nickname, int position,
                   List<String> produces, List<String> consumes, List<String> protocol, List<Authorization>
          authorizations, List<Parameter> parameters, List<ResponseMessage> responseMessages, String deprecated) {
    this.method = method;
    this.summary = summary;
    this.notes = notes;
    this.responseClass = responseClass;
    this.nickname = nickname;
    this.position = position;
    this.produces = produces;
    this.consumes = consumes;
    this.protocol = protocol;
    this.authorizations = authorizations;
    this.parameters = parameters;
    this.responseMessages = responseMessages;
    this.deprecated = deprecated;
  }

  public String method() {
    return method;
  }

  public String summary() {
    return summary;
  }

  public String notes() {
    return notes;
  }

  public String responseClass() {
    return responseClass;
  }

  public String nickname() {
    return nickname;
  }

  public int position() {
    return position;
  }

  public List<String> produces() {
    return produces;
  }

  public List<String> consumes() {
    return consumes;
  }

  public List<String> protocol() {
    return protocol;
  }

  public List<Authorization> authorizations() {
    return authorizations;
  }

  public List<Parameter> parameters() {
    return parameters;
  }

  public List<ResponseMessage> responseMessages() {
    return responseMessages;
  }

  public String deprecated() {
    return deprecated;
  }
}
