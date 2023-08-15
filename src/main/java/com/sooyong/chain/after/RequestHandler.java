package com.sooyong.chain.after;

import com.sooyong.chain.before.Request;

public abstract class RequestHandler {

  private RequestHandler nextHandler;

  public RequestHandler(RequestHandler nextHandler) {
    this.nextHandler = nextHandler;
  }

  public void handle(Request request) {
    if (nextHandler != null) {
      nextHandler.handle(request);
    }
  }
}
